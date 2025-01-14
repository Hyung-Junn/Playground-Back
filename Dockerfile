FROM --platform=$BUILDPLATFORM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/playground-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080
