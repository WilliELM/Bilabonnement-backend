package com.example.bilabonnementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class BilabonnementapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BilabonnementapiApplication.class, args);
    }

}
