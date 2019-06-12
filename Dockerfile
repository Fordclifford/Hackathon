FROM java:8-jdk-alpine

COPY ./target/hackathon-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch hackathon-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","hackathon-0.0.1-SNAPSHOT.jar"] 