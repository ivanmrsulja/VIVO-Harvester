@echo off
REM ====================================================================
REM VIVO Harvester Common Functions for Windows Batch Scripts
REM Copyright (c) 2010-2025 VIVO Harvester Team
REM ====================================================================

REM Function: Initialize environment
:init_environment
REM Parameters: %1=Harvest Name, %2=Harvester Install Dir (optional)
setlocal
set "HARVEST_NAME=%~1"
if "%~2"=="" (
    set "HARVESTER_INSTALL_DIR=%cd%\..\..\..\..\..\..\VIVO-Harvester"
) else (
    set "HARVESTER_INSTALL_DIR=%~2"
)

REM Get current date in ISO format
for /f "tokens=1-3 delims=/ " %%a in ("%date%") do (
    set YEAR=%%c
    set MONTH=%%a
    set DAY=%%b
)
if %MONTH% LSS 10 set MONTH=0%MONTH%
if %DAY% LSS 10 set DAY=0%DAY%

for /f "tokens=1-3 delims=:." %%a in ("%time%") do (
    set HOUR=%%a
    set MINUTE=%%b
    set SECOND=%%c
)
if %HOUR% LSS 10 set HOUR=0%HOUR%
if %MINUTE% LSS 10 set MINUTE=0%MINUTE%
if %SECOND% LSS 10 set SECOND=0%SECOND%

set "DATE=%YEAR%-%MONTH%-%DAY%T%HOUR%:%MINUTE%:%SECOND%"

REM Setup paths
set "PATH=%PATH%;%HARVESTER_INSTALL_DIR%\bin"
set "CLASSPATH=%CLASSPATH%;%HARVESTER_INSTALL_DIR%\bin\harvester.jar;%HARVESTER_INSTALL_DIR%\bin\dependency\*"
set "CLASSPATH=%CLASSPATH%;%HARVESTER_INSTALL_DIR%\build\harvester.jar;%HARVESTER_INSTALL_DIR%\build\dependency\*"

REM Java options
set "HARVESTER_JAVA_OPTS=-Xms1024M -Xmx2048M"

endlocal & (
    set "HARVEST_NAME=%HARVEST_NAME%"
    set "HARVESTER_INSTALL_DIR=%HARVESTER_INSTALL_DIR%"
    set "DATE=%DATE%"
    set "CLASSPATH=%CLASSPATH%"
    set "PATH=%PATH%"
    set "HARVESTER_JAVA_OPTS=%HARVESTER_JAVA_OPTS%"
)
goto :eof

REM Function: Setup logging
:setup_logging
setlocal
if not exist logs mkdir logs
cd logs
echo. > %HARVEST_NAME%.%DATE%.log
del %HARVEST_NAME%.latest.log 2>nul
copy %HARVEST_NAME%.%DATE%.log %HARVEST_NAME%.latest.log >nul 2>&1
cd ..
echo Full Logging in %HARVEST_NAME%.%DATE%.log
goto :eof

REM Function: Clean old data
:clean_data
if exist data rmdir /s /q data
goto :eof

REM Function: Execute fetch operation
:execute_fetch
REM Parameters: %1=Fetch class name, %2=Config file
setlocal
set "FETCH_CLASS=%~1"
set "CONFIG_FILE=%~2"

echo Executing fetch: %FETCH_CLASS%
if not exist "%CONFIG_FILE%" (
    echo ERROR: Missing configuration file: %CONFIG_FILE%
    exit /b 1
)

java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" %FETCH_CLASS% -X "%CONFIG_FILE%"
if %errorlevel% neq 0 exit /b %errorlevel%
endlocal
goto :eof

REM Function: Execute translate operation
:execute_translate
REM Parameters: %1=Config file (optional)
setlocal
if "%~1"=="" (
    set "CONFIG_FILE=xsltranslator.config.xml"
) else (
    set "CONFIG_FILE=%~1"
)

echo Translating data to valid RDF...
if not exist "%CONFIG_FILE%" (
    echo ERROR: Missing configuration file: %CONFIG_FILE%
    exit /b 1
)

java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.translate.XSLTranslator -X "%CONFIG_FILE%"
if %errorlevel% neq 0 exit /b %errorlevel%
endlocal
goto :eof

REM Function: Execute transfer to temp model
:execute_transfer
REM Parameters: %1=Common config directory
setlocal
set "COMMON_DIR=%~1"

echo Transferring RDF into temporary triple store...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO ^
    -s "%COMMON_DIR%\translation\translated-records.config.xml" ^
    -o "%COMMON_DIR%\harvestertransfer\harvested-data.model.xml" ^
    -d "data\harvested-data\imported-records.rdf.xml"
if %errorlevel% neq 0 exit /b %errorlevel%
endlocal
goto :eof

REM Function: Perform diff operations
:perform_diff
REM Parameters: %1=Common config directory
setlocal
set "COMMON_DIR=%~1"

echo Finding Subtractions...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.diff.Diff -X "%COMMON_DIR%\diff\diff-subtractions.config.xml"
if %errorlevel% neq 0 exit /b %errorlevel%

echo Finding Additions...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.diff.Diff -X "%COMMON_DIR%\diff\diff-additions.config.xml"
if %errorlevel% neq 0 exit /b %errorlevel%
endlocal
goto :eof

REM Function: Apply changes to previous model
:apply_changes_to_previous
REM Parameters: %1=Common config directory
setlocal
set "COMMON_DIR=%~1"

echo Applying Subtractions to Previous model...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO ^
    -o "%COMMON_DIR%\harvestertransfer\previous-harvest.model.xml" ^
    -r "data\vivo-subtractions.rdf.xml" -m
if %errorlevel% neq 0 exit /b %errorlevel%

echo Applying Additions to Previous model...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO ^
    -o "%COMMON_DIR%\harvestertransfer\previous-harvest.model.xml" ^
    -r "data\vivo-additions.rdf.xml"
if %errorlevel% neq 0 exit /b %errorlevel%
endlocal
goto :eof

REM Function: Apply changes to VIVO model
:apply_changes_to_vivo
REM Parameters: %1=Load method, %2=Common config directory
setlocal
set "LOAD_METHOD=%~1"
set "COMMON_DIR=%~2"

if "%LOAD_METHOD%"=="tdb" (
    echo Applying Subtractions to VIVO model...
    java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO ^
        -o "%COMMON_DIR%\modelupdate\vivo.model.xml" ^
        -r "data\vivo-subtractions.rdf.xml" -m
    if %errorlevel% neq 0 exit /b %errorlevel%

    echo Applying Additions to VIVO model...
    java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO ^
        -o "%COMMON_DIR%\modelupdate\vivo.model.xml" ^
        -r "data\vivo-additions.rdf.xml"
    if %errorlevel% neq 0 exit /b %errorlevel%
) else (
    echo Applying changes using SPARQL update...
    java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.services.SparqlUpdate ^
        -X "%COMMON_DIR%\modelupdate\sparqlupdate.conf.xml"
    if %errorlevel% neq 0 exit /b %errorlevel%
)
endlocal
goto :eof

REM Function: Count imports
:count_imports
echo Counting imported data...
set /a PUBS=0
set /a AUTHORS=0
set /a AUTHORSHIPS=0
set /a ORGS=0
set /a POSITIONS=0

if exist data\vivo-additions.rdf.xml (
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "oai"') do set /a PUBS=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "http://xmlns.com/foaf/0.1/Person"') do set /a AUTHORS=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "Authorship"') do set /a AUTHORSHIPS=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "http://xmlns.com/foaf/0.1/Organization"') do set /a ORGS=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "positionForPerson"') do set /a POSITIONS=%%i
)

echo Import Statistics:
if %PUBS% GTR 0 echo   - Publications: %PUBS%
if %AUTHORS% GTR 0 echo   - Authors: %AUTHORS%
if %AUTHORSHIPS% GTR 0 echo   - Authorships: %AUTHORSHIPS%
if %ORGS% GTR 0 echo   - Organizations: %ORGS%
if %POSITIONS% GTR 0 echo   - Positions: %POSITIONS%
goto :eof

REM Function: Validate load method parameter
:validate_load_method
REM Parameters: %1=Load method parameter
setlocal
set "INPUT=%~1"
if "%INPUT%"=="" (
    endlocal & set "LOAD_METHOD=sparql"
    goto :eof
)

if /I "%INPUT%"=="tdb" (
    endlocal & set "LOAD_METHOD=tdb"
    goto :eof
)

if /I "%INPUT%"=="sparql" (
    endlocal & set "LOAD_METHOD=sparql"
    goto :eof
)

echo Invalid argument: %INPUT%
echo Usage: %~nx0 [tdb^|sparql]
exit /b 1