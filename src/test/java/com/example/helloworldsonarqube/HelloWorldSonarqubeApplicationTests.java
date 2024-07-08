package com.example.helloworldsonarqube;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HelloWorldSonarqubeApplicationTests {

	@Test
	void contextLoads() {
		HelloWorldSonarqubeApplication.HelloWorldController application = new HelloWorldSonarqubeApplication().new HelloWorldController();
		assertThat(application).isNotNull();
	}

	@Test
	void testHelloWorld() {
		HelloWorldSonarqubeApplication.HelloWorldController controller = new HelloWorldSonarqubeApplication().new HelloWorldController();
		String response = controller.hello();
		assertThat(response).isEqualTo("Hello, World!");
	}

}
