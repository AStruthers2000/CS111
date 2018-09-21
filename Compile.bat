@echo OFF
set file=%1
rem set file2=%2
rem set file3=%3
rem set file4=%4
rem set file5=%5

set "fileWithPath=%file%.java"

copy "IntelliJ\%file%\src\%fileWithPath%" "jGRASP\"
javac "jGRASP\%fileWithPath%"
cd "jGRASP\"
echo =====Begin Java Execution=====
echo.
java "%file%"
echo.
echo ======End Java Exevution======
del /s /q /f *.class
cd ..