@echo off
REM ============================
REM OpenAlex Harvest Script
REM ============================

setlocal

REM Load common library - validate load method parameter
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :validate_load_method %1
if errorlevel 1 exit /b %errorlevel%

REM ============================
REM Configuration
REM ============================
set "COMMON_CONFIG_DIRECTORY=..\common"
set "HARVEST_NAME=OpenAlex-Harvest"
set "FETCH_CLASS=org.vivoweb.harvester.fetch.JSONFetch"
set "FETCH_CONFIG=openalex-jsonfetch.config.xml"

REM Special: JSONFetch uses different tool name
set "USE_JSONFETCH=true"

REM Initialize environment
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :init_environment "%HARVEST_NAME%"

REM ============================
REM Setup
REM ============================
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :setup_logging
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :clean_data

REM ============================
REM Execute Fetch (JSONFetch Special)
REM ============================
echo Fetching from OpenAlex.org...
if not exist "%FETCH_CONFIG%" (
    echo ERROR: Missing configuration file: %FETCH_CONFIG%
    exit /b 1
)

REM JSONFetch uses different command format
echo Executing JSONFetch...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" %FETCH_CLASS% -X "%FETCH_CONFIG%"
if %errorlevel% neq 0 exit /b %errorlevel%

REM ============================
REM Execute Translate
REM ============================
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :execute_translate
if errorlevel 1 exit /b %errorlevel%

REM ============================
REM Execute Transfer
REM ============================
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :execute_transfer "%COMMON_CONFIG_DIRECTORY%"
if errorlevel 1 exit /b %errorlevel%

REM ============================
REM Perform Update
REM ============================
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :perform_diff "%COMMON_CONFIG_DIRECTORY%"
if errorlevel 1 exit /b %errorlevel%

call "%~dp0..\common\sharedlibraries\harvester-common.bat" :apply_changes_to_previous "%COMMON_CONFIG_DIRECTORY%"
if errorlevel 1 exit /b %errorlevel%

call "%~dp0..\common\sharedlibraries\harvester-common.bat" :apply_changes_to_vivo "%LOAD_METHOD%" "%COMMON_CONFIG_DIRECTORY%"
if errorlevel 1 exit /b %errorlevel%

REM ============================
REM Report - OpenAlex specific counts
REM ============================
echo Counting OpenAlex imports...
set /a ORGS=0
set /a PEOPLE=0
set /a POSITIONS=0

if exist data\vivo-additions.rdf.xml (
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "http://xmlns.com/foaf/0.1/Organization"') do set /a ORGS=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "http://xmlns.com/foaf/0.1/Person"') do set /a PEOPLE=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "positionForPerson"') do set /a POSITIONS=%%i

    echo OpenAlex Import Statistics:
    if %ORGS% GTR 0 echo   - Organizations: %ORGS%
    if %PEOPLE% GTR 0 echo   - People: %PEOPLE%
    if %POSITIONS% GTR 0 echo   - Positions: %POSITIONS%

    REM Additional OpenAlex specific counts
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "openalex"') do set /a OPENALEX_RECORDS=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "Concept"') do set /a CONCEPTS=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "Work"') do set /a WORKS=%%i

    if %OPENALEX_RECORDS% GTR 0 echo   - OpenAlex Records: %OPENALEX_RECORDS%
    if %CONCEPTS% GTR 0 echo   - Concepts: %CONCEPTS%
    if %WORKS% GTR 0 echo   - Works: %WORKS%
) else (
    echo No import data found
)

echo.
echo OpenAlex harvest completed successfully.
endlocal
exit /b 0
