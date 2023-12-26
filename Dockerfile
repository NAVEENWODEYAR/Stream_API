#Dockerfile,

FROM openjdk:17
RUN mkdir /usr/app/
COPY target/StreamAPI_App.jar /usr/app 
