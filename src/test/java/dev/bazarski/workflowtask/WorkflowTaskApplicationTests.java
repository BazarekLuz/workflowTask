package dev.bazarski.workflowtask;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WorkflowTaskApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		assertEquals(5, result);
	}

	@Test
	void testAddUnsuccessful() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		assertEquals(6, result);
	}
}
