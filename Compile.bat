@echo OFF
set file=%1

set "fileWithPath=%file%.java"

copy "IntelliJ\%file%\src\%fileWithPath%" "jGRASP\"
javac "jGRASP\%fileWithPath%"
cd "jGRASP\"
java "%file%"
cd ..