FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/user-management-system-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app.jar"]