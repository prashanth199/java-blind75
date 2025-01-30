package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CoinChangeTest {

	private CoinChange coinChange;

	@BeforeEach
	void setUp() throws Exception {

		coinChange = new CoinChange();
	}

	@ParameterizedTest
	@MethodSource("providedTestCase")
	void test_case_one(int[] coins, int amt, int expected) {
		int actual = coinChange.coinChange(coins, amt);

		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@MethodSource("providedTestCase")
	void test_case_two(int[] coins, int amt, int expected) {
		int actual = coinChange.coinChangeUsingBFS(coins, amt);

		assertEquals(expected, actual);
	}

	private static Stream<Arguments> providedTestCase() {
		return Stream.of(Arguments.of(new int[] { 1, 2, 5 }, 11, 3), Arguments.of(new int[] { 2 }, 3, -1),
				Arguments.of(new int[] { 1 }, 0, 0));
	}

}
