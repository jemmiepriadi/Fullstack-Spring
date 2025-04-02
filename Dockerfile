# Stage 1: Build the application
FROM maven:3.8.6-eclipse-temurin-17 AS build
# Build Stage
WORKDIR /opt/app

COPY ./ /opt/app
RUN mvn clean install -DskipTests


# Docker Build Stage
FROM openjdk:8-jdk-alpine

COPY --from=build /opt/app/target/*.jar app.jar

ENV PORT 8081
EXPOSE $PORT

ENTRYPOINT ["java","-jar","-Xmx1024M","-Dserver.port=${PORT}","app.jar"]


