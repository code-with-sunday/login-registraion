package com.example.authWithSpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AuthWithSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthWithSpringbootApplication.class, args);
	}

}
