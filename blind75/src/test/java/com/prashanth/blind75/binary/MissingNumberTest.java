package com.prashanth.blind75.binary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MissingNumberTest {

	private MissingNumber missingNumber;

	@BeforeEach
	void setUp() throws Exception {

		missingNumber = new MissingNumber();
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_case_one(int[] nums, int expected) {
		int actual = missingNumber.findMissingNumberUsingMathematicalFormula(nums);

		assertTrue(expected == actual);
	}
	
	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_cased_two(int[] nums, int expected) {
		int actual = missingNumber.findMissingNumberUsingXOR(nums);

		assertTrue(expected == actual);
	}

	private static Stream<Arguments> providedTestCases() {

		return Stream.of(Arguments.of(new int[] { 3, 0, 1 }, 2), Arguments.of(new int[] { 0, 1 }, 2),
				Arguments.of(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }, 8));
	}

}
