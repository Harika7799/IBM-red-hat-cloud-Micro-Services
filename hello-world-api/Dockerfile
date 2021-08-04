FROM openjdk:latest
EXPOSE 8081
ADD target/hello-world-api.jar hello-world-api.jar
ENTRYPOINT ["sh", "-c", "java -jar /hello-world-api.jar"]