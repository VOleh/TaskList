FROM openjdk:11
EXPOSE 8082
ADD target/task-list-app.jar tasklist-app.jar
ENTRYPOINT ["java","-jar","tasklist-app.jar"]

