FROM adoptopenjdk/openjdk11:ubi
LABEL vendor="Araz"

COPY src/main/resources/application.properties /opt/
COPY target/jukebox-0.0.1-SNAPSHOT.jar /opt/application.jar
WORKDIR /opt

CMD ["java", "-Dspring.config.location=file:/opt/application.properties", "-jar", "/opt/application.jar"]