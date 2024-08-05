FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/reverse-proxy-0.0.1-SNAPSHOT.jar /app/reverse-proxy.jar
ENTRYPOINT ["java", "-jar", "/app/reverse-proxy.jar"]
