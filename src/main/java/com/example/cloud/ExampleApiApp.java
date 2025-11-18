package main.java.com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApiApp {

/*
    Api testovat pomoci prikazu

    curl -X POST http://localhost:8080/items -H "Content-Type: application/json" -d '{"name":"hello"}'
    curl http://localhost:8080/items
*/

    public static void main(String[] args) {
        SpringApplication.run(CloudWorkshopApiApplication.class, args);
    }
}

