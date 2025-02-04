package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CombinationSumFourTest {

	private CombinationSumFour combinationSumFour;

	@BeforeEach
	void setUp() throws Exception {
		combinationSumFour = new CombinationSumFour();
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void testCaseOne(int[] nums, int target, int expected) {

		int actual = combinationSumFour.countCombinationsUsingTopDownApproach(nums, target);

		assertEquals(expected, actual);

	}
	
	@ParameterizedTest
	@MethodSource("providedTestCases")
	void testCaseTwo(int[] nums, int target, int expected) {

		int actual = combinationSumFour.countCombinationsUsingBottomUpApproach(nums, target);

		assertEquals(expected, actual);

	}

	private static Stream<Arguments> providedTestCases() {

		return Stream.of(Arguments.of(new int[] { 1, 2, 3 }, 4, 7), Arguments.of(new int[] { 9 }, 3, 0));
	}

}
