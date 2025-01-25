FROM eclipse-temurin:17.0.13_11-jdk
ARG JAR_FILE=target/SGCampoV1-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} appCampo.jar
EXPOSE 7076

ENTRYPOINT ["java", "-jar", "appCampo.jar"]