REM refresh dagger generated classes in the impl module.
cd neutron-examples/neutron-examples-impl
REM rmdir /s /q target\generated-sources\annotations
call mvn clean compile
cd ../..