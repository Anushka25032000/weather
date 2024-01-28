# Stage 1: Build the application
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src src
RUN mvn clean install

# Stage 2: Create a smaller image for running the application
FROM openjdk:17.0-jdk-slim
WORKDIR /app
COPY --from=build /app/target/weatherApp-0.1.0.jar .
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "weatherApp-0.1.0.jar"]