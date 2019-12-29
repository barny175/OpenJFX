if defined JAVA_HOME goto javaFound

set JAVAC_EXE=javac.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto javaFound

echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo Please set the JAVA_HOME variable in your environment

:javaFound
if defined JAVAFX_SDK goto javafxFound
 
set JAVAFX_SDK="c:\Program Files\Java\javafx-sdk-11.0.2"

:javafxFound
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe
if exist "%JAVA_EXE%" goto exec

echo ERROR: Java SDK not found at: %JAVA_HOME%
goto fail

:exec
"%JAVA_EXE%"   --module-path %JAVAFX_SDK%\lib  --add-modules javafx.controls HelloWorld
goto end

:fail
exit /b 1

:end
