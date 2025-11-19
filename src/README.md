Cloud Workshop API
---------------
Přehled
Tento projekt je jednoduché REST API ve Spring Bootu určené pro workshop o cloudu, kontejnerech a nasazení aplikací.
API poskytuje základní CRUD operace pro entitu Item. Data se ukládají pouze do paměti, takže není potřeba databáze.
_______________________
Požadavky:

- Java 17+

- Maven 3.8+

- Docker pro spuštění v kontejneru
________________________
Lokální spuštění:

- mvn spring-boot:run

- Aplikace poběží na: http://localhost:8080

______________________
Docker build image:

- docker build -t cloud-workshop-api .
- docker run -p 8080:8080 cloud-workshop-api
_______________________







