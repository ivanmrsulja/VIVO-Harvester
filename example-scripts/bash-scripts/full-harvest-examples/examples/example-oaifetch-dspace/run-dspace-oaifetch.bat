@echo off
REM ============================
REM DSpace OAI Harvest Script
REM ============================

setlocal

REM Load common library
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :validate_load_method %1
if errorlevel 1 exit /b %errorlevel%

REM Configuration
set "COMMON_CONFIG_DIRECTORY=..\common"
set "HARVEST_NAME=DSpace-OAI-fetch"
set "FETCH_CLASS=org.vivoweb.harvester.fetch.OAIFetch"
set "FETCH_CONFIG=dspace-oaifetch.conf.xml"

REM Initialize environment
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :init_environment "%HARVEST_NAME%"

REM Setup
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :setup_logging
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :clean_data

REM ============================
REM Execute Fetch
REM ============================
echo Fetching from DSpace...
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :execute_fetch "%FETCH_CLASS%" "%FETCH_CONFIG%"
if errorlevel 1 exit /b %errorlevel%

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
REM Optional: Scoring and Matching (Commented out)
REM ============================
REM Uncomment if needed:
REM echo Scoring publications...
REM java %HARVESTER_JAVA_OPTS% -cp "%CLASSPATH%" org.vivoweb.harvester.score.Score -X score-pub.conf.xml
REM if %errorlevel% neq 0 exit /b %errorlevel%

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
REM Report
REM ============================
call "%~dp0..\common\sharedlibraries\harvester-common.bat" :count_imports

echo DSpace OAI harvest completed successfully.
endlocal
exit /b 0
