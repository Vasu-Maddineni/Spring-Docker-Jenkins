FROM eclipse-temurin:17-jdk
EXPOSE 8080
ADD target/spring-docker-jenkins.jar spring-docker-jenkins.jar
ENTRYPOINT [ "java","-jar", "spring-docker-jenkins.jar" ]