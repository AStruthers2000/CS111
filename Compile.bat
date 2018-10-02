@echo OFF
set file=%1

copy "IntelliJ\%file%\src\*.java" "jGRASP\"

javac jGRASP\*.java
cd "jGRASP\"

echo =====Begin Java Execution=====
echo.
java "%file%"
echo.
echo ======End Java Exevution======

del /s /q /f *.class 1>nul
cd ..