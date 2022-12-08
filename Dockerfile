#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM amazoncorretto:19-alpine-jdk
MAINTAINER Abderrezak-Boukazouha
COPY target/formation-0.0.1-SNAPSHOT.jar formation-0.0.1.jar
ENTRYPOINT ["java","-jar","/formation-0.0.1.jar"]