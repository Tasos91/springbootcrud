FROM openjdk:17-jdk

WORKDIR /app

COPY /target/springbootcrud-v1.jar /app/springbootcrud-v1.jar


EXPOSE 8080

CMD ["java", "-jar", "springbootcrud-v1.jar"]
