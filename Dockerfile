FROM adoptopenjdk:11-jre-hotspot
RUN mkdir /opt/app
COPY digleage-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/digleage-0.0.1-SNAPSHOT.jar"]
