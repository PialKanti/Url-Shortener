FROM eclipse-temurin:21-jdk-jammy AS builder
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline
COPY src ./src
RUN ./mvnw clean install -DskipTests

FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
EXPOSE 8080
COPY --from=builder /app/target/*.jar app.jar
COPY --from=builder /app/src/main/resources/newrelic /src/resources/newrelic
COPY --from=builder /app/src/main/resources/entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]