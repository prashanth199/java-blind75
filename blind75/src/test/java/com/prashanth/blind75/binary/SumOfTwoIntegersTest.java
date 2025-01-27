package com.prashanth.blind75.binary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumOfTwoIntegersTest {

	private SumOfTwoIntegers sumOfTwoIntegers;

	@BeforeEach
	void setUp() throws Exception {
		sumOfTwoIntegers = new SumOfTwoIntegers();
	}

	@Test
	void test_case_one() {
		int a = 1, b = 2;

		int expected = 3;
		int actual = sumOfTwoIntegers.getSum(a, b);

		assertTrue(expected == actual);

	}

	@Test
	void test_case_two() {
		int a = 2, b = 3;

		int expected = 5;
		int actual = sumOfTwoIntegers.getSum(a, b);

		assertTrue(expected == actual);

	}

}
