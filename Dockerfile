#Dockerfile,

FROM openjdk:17
RUN mkdir /usr/app/
COPY target/StreamAPI_App.jar /usr/app 
WORKDIR /usr/app/ 
ENTRYPOINT [ "java","-jar","StreamAPI_App.jar"]