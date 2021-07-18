FROM openjdk:latest
EXPOSE 8082
ADD target/student-service.jar student-service.jar
ENTRYPOINT ["sh", "-c", "java -jar /student-service.jar"]