FROM openjdk:11
EXPOSE 8082
ADD target/task-list-app task-list-app
ENTRYPOINT ["java","-jar","task-list-app"]

