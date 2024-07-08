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
			generateSonarIssue1();
			generateSonarIssue2();
			generateSonarIssue3();
			generateSonarIssue4();
			generateSonarIssue5();
			generateSonarIssue6();
			generateSonarIssue7();
			generateSonarIssue8();
			generateSonarIssue9();
			generateSonarIssue10();
			return "Hello, World!";
		}
	}

	private void generateSonarIssue1() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

	private void generateSonarIssue2() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

	private void generateSonarIssue3() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

	private void generateSonarIssue4() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

	private void generateSonarIssue5() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

	private void generateSonarIssue6() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

	private void generateSonarIssue7() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

	private void generateSonarIssue8() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

	private void generateSonarIssue9() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

	private void generateSonarIssue10() {
		try {
			int divideByZero = 1 / 0; // This will cause an exception
		} catch (Exception e) {
			// Empty catch block is a common issue that SonarCloud will detect
		}
	}

}
