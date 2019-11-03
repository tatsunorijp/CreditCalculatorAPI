package com.CreditCalculator.creditCalculator;

import com.CreditCalculator.controller.CalculatorController;
import com.CreditCalculator.models.CreditLimitModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CreditCalculatorControllerApplicationTests {

	@Test
	void contextLoads() {
		CreditLimitModel creditRequest = new CreditLimitModel(
				"1",
				"1",
				"1",
				"1",
				"1"
		);

		assertEquals(0, CalculatorController.calculateCreditLimit(creditRequest));
	}

}
