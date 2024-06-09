FROM adoptopenjdk/openjdk11
LABEL maintainer="gunjan@gmail.com"
EXPOSE 8081
COPY target/awscicdpipeline.jar awscicdpipeline.jar
ENTRYPOINT ["java","-jar","/awscicdpipeline.jar"]