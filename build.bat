set JAVA_HOME=%JAVA9_HOME%
set PATH=%JAVA_HOME%\bin;%PATH%
call mvn --version
call mvn clean package
java --module-path target/my-jaxb-0.1.jar -m my/my.JAXBExample
