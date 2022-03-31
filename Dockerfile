FROM openjdk:11
COPY springbootdockergradle-0.0.1.jar /springbootdockergradle-0.0.1.jar
CMD ["java","-jar","springbootdockergradle-0.0.1.jar"]