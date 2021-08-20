FROM openjdk:1.8-jdk-alpine
VOLUME /tmp
ADD demoTest/target/*.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]