if defined JAVA_HOME goto javaFound

set JAVAC_EXE=javac.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto javaFound

echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo Please set the JAVA_HOME variable in your environment

:javaFound
if defined JAVAFX_SDK goto javafxFound
 
echo ERROR: variable JAVAFX_SDK not set
echo Please set the JAVAFX_SDK variable in your environment to match the
echo location of your OpenJFX or JavaFX  installation.
 
:javafxFound
set JAVA_HOME=%JAVA_HOME:"=%
set JAVAC_EXE=%JAVA_HOME%/bin/javac.exe
if exist "%JAVAC_EXE%" goto exec

echo ERROR: Java SDK not found at: %JAVA_HOME%
goto fail

:exec
"%JAVAC_EXE%"   --module-path %JAVAFX_SDK%\lib --add-modules javafx.controls HelloWorld.java 
goto end

:fail
exit /b 1

:end
