package com.leadows.rest_with_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWithJpaApplication.class, args); // Connects with db while creation of bean Using config params in application.properties
	}

}
