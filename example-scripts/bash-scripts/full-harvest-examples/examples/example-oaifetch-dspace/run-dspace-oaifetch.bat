@echo off
REM ============================
REM HARVESTER SCRIPT
REM ============================

REM Load method selection (default: sparql)
set LOAD_METHOD=sparql

if not "%~1"=="" (
    if /I "%~1"=="tdb" (
        set LOAD_METHOD=tdb
    ) else if /I "%~1"=="sparql" (
        set LOAD_METHOD=sparql
    ) else (
        echo Invalid argument: %~1
        echo Usage: %~nx0 [tdb|sparql]
        exit /b 1
    )
)

REM Copyright (c) 2010-2011 VIVO Harvester Team. For full list of contributors, please see the AUTHORS file provided.
REM All rights reserved.
REM This program and the accompanying materials are made available under the terms of the new BSD license which accompanies this distribution, and is available at http://www.opensource.org/licenses/bsd-license.html

set COMMON_CONFIG_DIRECTORY=..\common

REM set to the directory where the harvester was installed or unpacked
REM HARVESTER_INSTALL_DIR is set to the location of the installed harvester
REM	If the deb file was used to install the harvester then the
REM	directory should be set to /usr/share/vivo/harvester which is the
REM	current location associated with the deb installation.
REM	Since it is also possible the harvester was installed by
REM	uncompressing the tar.gz the setting is available to be changed
REM	and should agree with the installation location
REM set HARVESTER_INSTALL_DIR=<HARVESTER_INSTALL_DIR>
set "HARVESTER_INSTALL_DIR=%cd%\..\..\..\..\..\..\VIVO-Harvester"
set HARVEST_NAME=DSpace-OAI-fetch

REM Get current date in ISO format (YYYY-MM-DD'T'HH:MM:SS)
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

set DATE=%YEAR%-%MONTH%-%DAY%T%HOUR%:%MINUTE%:%SECOND%

REM Add harvester binaries to path for execution
REM The tools within this script refer to binaries supplied within the harvester
REM	Since they can be located in another directory their path should be
REM	included within the classpath and the path environment variables.
set "PATH=%PATH%;%HARVESTER_INSTALL_DIR%\bin"
set "CLASSPATH=%CLASSPATH%;%HARVESTER_INSTALL_DIR%\bin\harvester.jar;%HARVESTER_INSTALL_DIR%\bin\dependency\*"
set "CLASSPATH=%CLASSPATH%;%HARVESTER_INSTALL_DIR%\build\harvester.jar;%HARVESTER_INSTALL_DIR%\build\dependency\*"

REM Java options
set HARVESTER_JAVA_OPTS=-Xms1024M -Xmx2048M

REM Supply the location of the detailed log file which is generated during the script.
REM	If there is an issue with a harvest, this file proves invaluable in finding
REM	a solution to the problem. It has become common practice in addressing a problem
REM	to request this file. The passwords and usernames are filtered out of this file
REM	to prevent these logs from containing sensitive information.
echo Full Logging in %HARVEST_NAME%.%DATE%.log
if not exist logs mkdir logs
cd logs
echo. > %HARVEST_NAME%.%DATE%.log
del %HARVEST_NAME%.latest.log 2>nul
mklink %HARVEST_NAME%.latest.log %HARVEST_NAME%.%DATE%.log >nul 2>&1
cd ..

REM clear old data
REM For a fresh harvest, the removal of the previous information maintains data integrity.
REM	If you are continuing a partial run or wish to use the old and already retrieved
REM	data, you will want to comment out this line since it could prevent you from having
REM 	the required harvest data.
if exist data rmdir /s /q data

REM ============================
REM Execute Fetch
REM ============================
REM This stage of the script is where the information is gathered together into one local
REM	place to facilitate the further steps of the harvest. The data is stored locally
REM	in a format based off of the source. The format is a form of RDF but not in the VIVO ontology
echo Fetching from DSpace...
IF NOT EXIST dspace-oaifetch.conf.xml (
    echo ERROR: Missing configuration file: dspace-oaifetch.conf.xml
    exit /b 1
)
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.fetch.OAIFetch -X dspace-oaifetch.conf.xml
if %errorlevel% neq 0 exit /b %errorlevel%

REM ============================
REM Execute Translate
REM ============================
REM This is the part of the script where the input data is transformed into valid RDF
REM   Translate will apply an xslt file to the fetched data which will result in the data
REM   becoming valid RDF in the VIVO ontology
echo Translating data to valid RDF...
IF NOT EXIST xsltranslator.config.xml (
    echo ERROR: Missing configuration file: xsltranslator.config.xml
    exit /b 1
)
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.translate.XSLTranslator -X xsltranslator.config.xml
if %errorlevel% neq 0 exit /b %errorlevel%

REM ============================
REM Execute Transfer to import from record handler into local temp model
REM ============================
REM From this stage on the script places the data into a Jena model. A model is a
REM	data storage structure similar to a database, but in RDF.
REM The harvester tool Transfer is used to move/add/remove/dump data in models.
REM For this call on the transfer tool:
REM -s refers to the source translated records file, which was just produced by the translator step
REM -o refers to the destination model for harvested data
REM -d means that this call will also produce a text dump file in the specified location
echo Transferring RDF into temporary triple store...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO -s %COMMON_CONFIG_DIRECTORY%\translation\translated-records.config.xml -o %COMMON_CONFIG_DIRECTORY%\harvestertransfer\harvested-data.model.xml -d data\harvested-data\imported-records.rdf.xml
if %errorlevel% neq 0 exit /b %errorlevel%

REM ============================
REM Score and Match Stages (Commented out by default)
REM ============================
REM Uncomment these lines if you need scoring and matching functionality

REM Score on publications
REM echo Scoring publications...
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.score.Score -X score-pub.conf.xml
REM if %errorlevel% neq 0 exit /b %errorlevel%

REM Match publications
REM echo Matching publications...
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.match.Match -X match-pub.conf.xml
REM if %errorlevel% neq 0 exit /b %errorlevel%

REM Score on authors, organizations, geographic locations, journals, hyperlinks, and date-time intervals
REM echo Scoring authors...
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.score.Score -X score-author.conf.xml
REM if %errorlevel% neq 0 exit /b %errorlevel%

REM echo Scoring publishers...
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.score.Score -X score-publisher.conf.xml
REM if %errorlevel% neq 0 exit /b %errorlevel%

REM Score on authorships
REM echo Scoring authorships...
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.score.Score -X score-authorship.conf.xml
REM if %errorlevel% neq 0 exit /b %errorlevel%

REM Match authorships
REM echo Matching authorships...
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.match.Match -X match-authorship.conf.xml
REM if %errorlevel% neq 0 exit /b %errorlevel%

REM Truncate Score Data model
REM echo Truncating score data model...
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -X truncate.config.xml
REM if %errorlevel% neq 0 exit /b %errorlevel%

REM ============================
REM Execute ChangeNamespace (Commented out by default)
REM ============================
REM This is where the new people from the harvest are given uris within the namespace of Vivo
REM 	If there is an issue with uris being in another namespace after import, make sure this step
REM   was completed for those uris.

REM echo Changing namespace...
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.util.repo.ChangeNamespace -X changenamespace-all.config.xml
REM if %errorlevel% neq 0 exit /b %errorlevel%

REM ============================
REM Dump harvested data model for testing (Commented out by default)
REM ============================
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -X harvested-dump.config.xml

REM ============================
REM Perform an update
REM ============================
REM The harvester maintains copies of previous harvests in order to perform the same harvest twice
REM   but only add the new statements, while removing the old statements that are no longer
REM   contained in the input data. This is done in several steps of finding the old statements,
REM   then the new statements, and then applying them to the Vivo main model.

REM Find Subtractions
REM When making the previous harvest model agree with the current harvest, the statements that exist in
REM	the previous harvest but not in the current harvest need to be identified for removal.
echo Finding Subtractions...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.diff.Diff -X %COMMON_CONFIG_DIRECTORY%\diff\diff-subtractions.config.xml
if %errorlevel% neq 0 exit /b %errorlevel%

REM Find Additions
REM When making the previous harvest model agree with the current harvest, the statements that exist in
REM	the current harvest but not in the previous harvest need to be identified for addition.
echo Finding Additions...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.diff.Diff -X %COMMON_CONFIG_DIRECTORY%\diff\diff-additions.config.xml
if %errorlevel% neq 0 exit /b %errorlevel%

REM Apply Subtractions to Previous model
echo Applying Subtractions to Previous model...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO -o %COMMON_CONFIG_DIRECTORY%\harvestertransfer\previous-harvest.model.xml -r data\vivo-subtractions.rdf.xml -m
if %errorlevel% neq 0 exit /b %errorlevel%

REM Apply Additions to Previous model
echo Applying Additions to Previous model...
java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO -o %COMMON_CONFIG_DIRECTORY%\harvestertransfer\previous-harvest.model.xml -r data\vivo-additions.rdf.xml
if %errorlevel% neq 0 exit /b %errorlevel%

REM Now that the changes have been applied to the previous harvest and the harvested data in vivo
REM	agree with the previous harvest, the changes are now applied to the vivo model.
if "%LOAD_METHOD%"=="tdb" (
    echo Applying Subtractions to VIVO model...
    java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO -o %COMMON_CONFIG_DIRECTORY%\modelupdate\vivo.model.xml -r data\vivo-subtractions.rdf.xml -m
    if %errorlevel% neq 0 exit /b %errorlevel%

    echo Applying Additions to VIVO model...
    java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.transfer.Transfer -w INFO -o %COMMON_CONFIG_DIRECTORY%\modelupdate\vivo.model.xml -r data\vivo-additions.rdf.xml
    if %errorlevel% neq 0 exit /b %errorlevel%
) else (
    echo Applying changes using SPARQL update...
    java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.services.SparqlUpdate -X %COMMON_CONFIG_DIRECTORY%\modelupdate\sparqlupdate.conf.xml
    if %errorlevel% neq 0 exit /b %errorlevel%
)

REM ============================
REM Output some counts
REM ============================
echo Counting imported data...
set /a PUBS=0
set /a AUTHORS=0
set /a AUTHORSHIPS=0

if exist data\vivo-additions.rdf.xml (
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "oai"') do set /a PUBS=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "http://xmlns.com/foaf/0.1/Person"') do set /a AUTHORS=%%i
    for /f "delims=" %%i in ('type data\vivo-additions.rdf.xml ^| find /c "Authorship"') do set /a AUTHORSHIPS=%%i
)

echo Imported %PUBS% publications, %AUTHORS% authors, and %AUTHORSHIPS% authorships

echo Harvest completed successfully.
exit /b 0