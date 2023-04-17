FROM openjdk:11-jdk-slim
COPY --from=build /target/user-management-system-0.0.1-SNAPSHOT.jar app.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]