package com.CreditCalculator.creditCalculator;

import com.CreditCalculator.controller.CalculatorController;
import com.CreditCalculator.models.CreditLimitModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CreditCalculatorControllerApplicationTests {

	@Test
	void test_shouldReturnZeroLimit_WhenLowValues() {
		CreditLimitModel creditRequest = new CreditLimitModel(
				"1",
				"1",
				"1",
				"1",
				"1"
		);

		assertEquals(0, CalculatorController.calculateCreditLimit(creditRequest));
	}

	@Test
	void test_shoulReturnAMediumLimit_WhenMediumValues() {
		CreditLimitModel mediumCreditValues = new CreditLimitModel(
				"10000",
				"10000",
				"5",
				"300000",
				"700"
		);

		Double creditValue = CalculatorController.calculateCreditLimit(mediumCreditValues);
		assertTrue(creditValue > 5000);
		assertTrue(creditValue < 16000);
	}

	@Test
	void test_shouldReturnAHighLimit_WhenHighValues() {
		CreditLimitModel hightCreditValues = new CreditLimitModel(
				"17000",
				"17000",
				"8",
				"600000",
				"975"
		);

		Double creditValue = CalculatorController.calculateCreditLimit(hightCreditValues);
		assertTrue(creditValue > 14000);
		assertTrue( creditValue < 30000);
	}

}
