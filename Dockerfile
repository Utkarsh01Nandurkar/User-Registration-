# Use an official Maven image to build the app
FROM maven:3.8.5-openjdk-17-slim AS builder

# Set work directory
WORKDIR /app

# Copy source code
COPY . .

# Package the application
RUN mvn clean package -DskipTests

# Use a minimal JDK image to run the app
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the built JAR file
COPY --from=builder /app/target/*.jar app.jar

# Expose port (update if different in application.properties)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
