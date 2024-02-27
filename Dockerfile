FROM openjdk:17-jdk

WORKDIR /app

COPY /target/springbootcrud-0.0.1-SNAPSHOT.jar /app/springbootcrud-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "springbootcrud-0.0.1-SNAPSHOT.jar"]
