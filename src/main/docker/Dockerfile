FROM java:8-jre
ADD spinnaker-service-example-1.0.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xmx1024m","-Xmx1024m","-jar","/app.jar"]
