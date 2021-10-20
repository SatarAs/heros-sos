FROM maven:3.8.3-jdk-11

WORKDIR /var/heros-app
COPY ./heros-app ./var/heros-app
RUN mvn clean install

CMD mvn spring-boot:run