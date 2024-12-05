FROM maven:3.9.6-eclipse-temurin-21-alpine
RUN mkdir -p /desafioeda
WORKDIR /desafioeda
COPY pom.xml /desafioeda
COPY src /desafioeda/src
EXPOSE 3003
ENTRYPOINT ["mvn","spring-boot:run"]
