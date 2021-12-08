FROM openjdk:11
EXPOSE 8082
ADD target/task-list-app.jar task-list-app.jar
ENTRYPOINT ["java","-jar","task-list-app.jar"]

