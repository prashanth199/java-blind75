package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HouseRobberTwoTest {

	private HouseRobberTwo houseRobberTwo;

	@BeforeEach
	void setUp() throws Exception {
		houseRobberTwo = new HouseRobberTwo();
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_case_one(int[] nums, int expected) {
		
		int actual = houseRobberTwo.getMaxLoot(nums);
		assertEquals(expected, actual);

	}

	private static Stream<Arguments> providedTestCases() {
		return Stream.of(Arguments.of(new int[] { 2, 3, 2 }, 3), Arguments.of(new int[] { 1, 2, 3, 1 }, 4),
				Arguments.of(new int[] { 1, 2, 3 }, 3));
	}

}
