FROM eclipse-temurin:21
WORKDIR /app
COPY target/RealTimeApplication.jar RealTimeApplication.jar
ENTRYPOINT ["java","-jar","RealTimeApplication.jar"]