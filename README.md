"# Hackathon" 
#Normal Installation Requirements
Java 1.8
Mysql 8.0

1. build the application as follows
mvnw clean build 
or run directly as
mvn spring-boot:run
access the movies apis in http://localhost:8088/api/movies

#Docker 
docker build -t hackathon .
docker run -p 8090:8088 hackathon
