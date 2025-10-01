FROM gradle:8.8-jdk21

WORKDIR /opt/app

COPY build/libs/tweetle-discovery-service-0.0.1-SNAPSHOT.jar ./

EXPOSE 8761

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar tweetle-discovery-service-0.0.1-SNAPSHOT.jar"]