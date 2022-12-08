FROM amazoncorretto:19-alpine-jdk
MAINTAINER Abderrezak-Boukazouha
COPY target/formation-0.0.1-SNAPSHOT.jar formation-0.0.1.jar
ENTRYPOINT ["java","-jar","/formation-0.0.1.jar"]