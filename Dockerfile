#
# Build stage
#
FROM maven:3.8-amazoncorretto-19 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM amazoncorretto:19-alpine-jdk
MAINTAINER Abderrezak-Boukazouha
COPY --from=build /home/app/target/formation-0.0.1-SNAPSHOT.jar /usr/local/lib/formation.jar
ENTRYPOINT ["java","-jar","/usr/local/lib/formation.jar"]