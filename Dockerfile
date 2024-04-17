FROM openjdk:11-jre-slim

WORKDIR /app
COPY target/5522-restapi.jar app.jar
EXPOSE 5522
  
ENTRYPOINT ["java", "-jar", "app.jar"]