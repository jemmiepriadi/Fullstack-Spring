# Stage 1: Build the application
FROM maven:3.8.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests

# Stage 2: Create a lightweight runtime image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Install curl
RUN apk add --no-cache curl
COPY --from=build /app/target/fullstack-spring-0.0.1-SNAPSHOT.jar app.jar
ENV PORT 8081
EXPOSE 8081
CMD ["java", "-jar", "app.jar"]
