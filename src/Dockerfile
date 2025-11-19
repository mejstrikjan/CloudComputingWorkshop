# Base image s JDK 17
FROM eclipse-temurin:17-jdk

# Nastavení pracovního adresáře
WORKDIR /app

# Nejprve zkopíruj Maven wrapper a pom.xml, stáhni závislosti offline
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
RUN ./mvnw dependency:go-offline

# Pak zkopíruj zdrojový kód
COPY src src

# Sestavení jar (testy přeskočeny)
RUN ./mvnw package -DskipTests

# Expose port
EXPOSE 8080

# Spuštění aplikace
ENTRYPOINT ["java", "-jar", "target/cloud-workshop-api-1.0.0.jar"]
