package org.launchcode.hellospring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloSpringApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void checkFish() {
		String expected = "The fishing hole";
		String check = "The fishing hole";
		assertEquals(expected, check);
	}

	@Test
	void succeedingTest() {
		/* no-op */
	}



}
