FROM openjdk:23-jdk
WORKDIR /app
COPY WebServer.class /app/
EXPOSE 8080
CMD ["java", "WebServer"]

