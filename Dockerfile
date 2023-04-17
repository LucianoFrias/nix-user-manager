FROM ibm-semeru-runtimes:open-li-jre-focal
EXPOSE 8080
ADD ./target/*.jar ./app.jar
CMD java -Ojava.security.egd=file:/dev/./urandon -jar app.jar