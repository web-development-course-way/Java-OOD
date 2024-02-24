# This file is used to build and run the Spring boot application
# It uses multi-stage builds which is introduced since docker 17.05 (multiple 'FROM' instructions)
# So, this file needs to be used with docker 17.05+

#Use the maven base image for the container in which to build the Spring Boot app
FROM maven:3.8.4-openjdk-8 AS java_postgres_app_builder

# Create the directory inside which to build the Spring Boot application
RUN mkdir -p /build_app

WORKDIR /build_app/

# Copy the pom.xml and the application source code to the build_app directory
COPY pom.xml /build_app
COPY src /build_app/src

# Build the application on the java_postgres_app_builder docker container
RUN mvn clean package

RUN apt-get update && apt-get install -y git

# Run the application
ENTRYPOINT ["java", "-jar", "/build_app/target/topcoder-api-java-postgres-1.0.0.jar"]