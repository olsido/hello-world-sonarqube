package com.example.helloworldsonarqube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldSonarqubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSonarqubeApplication.class, args);
	}

	@RestController
	class HelloWorldController {
		@GetMapping("/")
		public String hello() {
			return "Hello, World!";
		}
	}

}
