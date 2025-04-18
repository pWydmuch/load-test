FROM openjdk:21
LABEL authors="patryk"
EXPOSE 8080
ADD build/libs/service-b-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]