FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /target/paint-squares-command-application-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=ci -Dconfig.resource=/ci.conf -jar /app.jar" ]