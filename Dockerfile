FROM openjdk:11-jre-slim
COPY /target/dockerexample-0.0.1-SNAPSHOT.jar bookApp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/bookApp.jar"]