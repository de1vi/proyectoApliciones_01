#el JDK que utilizas en tu proyecto
FROM amazoncorretto:21-alpine-jdk
#ejecusion de la programa
COPY target/api-0.0.1-SNAPSHOT.jar api.jar

ENTRYPOINT ["java","-jar","/api.jar"]
