package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ClimbingStairsTest {

	private ClimbingStairs climbingStairs;

	@BeforeEach
	void setUp() throws Exception {
		climbingStairs = new ClimbingStairs();
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_case_one(int n, int expected) {
		int actual = climbingStairs.climbStairsRecursive(n);

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_case_two(int n, int expected) {
		int actual = climbingStairs.climbStairsDP(n);

		assertEquals(expected, actual);

	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_case_three(int n, int expected) {
		int actual = climbingStairs.climbStairsSpaceOptimized(n);

		assertEquals(expected, actual);

	}

	private static Stream<Arguments> providedTestCases() {

		return Stream.of(Arguments.of(2, 2), Arguments.of(3, 3));
	}

}
