FROM java:8-alpine
RUN mkdir -p /application
COPY application.jar /application/application.jar
WORKDIR /application
CMD ["java","-jar","application.jar"]
