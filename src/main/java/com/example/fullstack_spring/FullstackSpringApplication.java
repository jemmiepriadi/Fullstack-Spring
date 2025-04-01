package com.example.fullstack_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.fullstack_spring.repos")
public class FullstackSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackSpringApplication.class, args);
	}

}
