FROM openjdk:8
EXPOSE 8195
ADD build/libs/*.jar docker-test-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker-test-app-0.0.1-SNAPSHOT.jar"]