FROM --platform=linux/amd64 openjdk:17.0.1-jdk-slim

ARG JAR_FILE=build/libs/*SNAPSHOT.jar

WORKDIR /opt/app

COPY ${JAR_FILE} springboot-mongodb.jar

ENTRYPOINT ["java","-jar","springboot-mongodb.jar"]
