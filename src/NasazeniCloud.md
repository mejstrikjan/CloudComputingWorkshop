☁️ Nasazení do cloudu:
--------------------------
Pomocí Render.com:

1. Otevřít Render.com
2. → New → Web Service
3. → Connect GitHub → vyber repo, v tomto případě je repo: https://github.com/mejstrikjan/CloudComputingWorkshop
4. 3️⃣ Nastav parametry:
   - Pole:      	Hodnota
   - Environment:	Docker
   - Branch:	    main
   - Build Command:	mvn clean package
   - Start Command:	java -jar target/*.jar
   - Instance Type:	Free
5. Klikni Deploy -> Api je nyní dostupné veřejné url formátu: https://cloud-workshop-api.onrender.com
__________________
Nasazení Spring Boot
-----
1. Vytvoření projektu přes start.spring.io

Otevři https://start.spring.io

Vyplň:
- Project: Maven Project
- Language: Java
- Spring Boot: 3.3.1
- Group: com.example
- Artifact: cloud-workshop
- Packaging: jar (nebo war pokud budeš deployovat na Tomcat)
- Java: 17
- Přidej dependencies:
  - Spring Web
   - Spring Data Redis
   - Spring Boot DevTools (volitelné pro rychlé restartování)
   - Spring Security (pokud je potřeba)

- Klikni na Generate → stáhne se zip → rozbal → otevři v IntelliJ/VSCode.

Návod na spuštění dockeru je v dockerfile
_______________________________
Redis
---
Pro lokální Redis použij Docker:
- docker run -d --name redis -p 6379:6379 redis:7
Redis poběží na portu 6379
Backend se připojí přes spring.redis.host=localhost a spring.redis.port=6379
Docker spustíš klasicky přes docker-compose up -d
_____________________
Cloud Redis
--
Vytvoření backendu (Spring Boot)

Použij start.spring.io
- Maven, Java 17, Spring Boot 3.3.1
- Dependencies: Spring Web, Spring Data Redis

Vytvoř Redis instance

Render → New → Redis

Zapiš si host, port, password

Vytvoř Web Service pro backend

GitHub repo → branch main

Environment: Docker

Build Command: mvn clean package

Start Command: java -jar target/*.jar

Přidej environment variables:

SPRING_REDIS_HOST → host z Redis služby

SPRING_REDIS_PORT → 6379

SPRING_REDIS_PASSWORD → heslo, pokud je

Deploy → backend je online a připojený k cloud Redis.
