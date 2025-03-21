FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

RUN apk add --no-cache git
RUN git clone https://github.com/AdolisPali/jopa-back.git .

WORKDIR /app/winter
RUN ./mvnw clean install -DskipTests

EXPOSE 8080
CMD ["java", "-jar", "target/jopa-back-0.0.1-SNAPSHOT.jar"]
