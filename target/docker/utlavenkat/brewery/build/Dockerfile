FROM openjdk:8-jdk-alpine

EXPOSE 8081

VOLUME /tmp
ADD maven/brewery-1.0.0-SNAPSHOT.jar brewery-1.0.0-SNAPSHOT.jar
RUN sh -c 'touch /brewery-1.0.0-SNAPSHOT.war'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/brewery-1.0.0-SNAPSHOT.jar"]
