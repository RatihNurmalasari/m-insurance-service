FROM maven:3.5-jdk-8-alpine

ADD ./scr /springboot-service/scr
ADD ./target /springboot-service/target
ADD ./pom.xml /springboot-service/pom.xml

WORKDIR /springboot-service

RUN mvn clean package

EXPOSE 8080

CMD java -jar target/menulife-claim-api-0.0.1-SNAPSHOT.jar
