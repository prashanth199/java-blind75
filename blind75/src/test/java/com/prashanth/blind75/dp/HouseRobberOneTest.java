package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HouseRobberOneTest {

	private HouseRobberOne houseRobberOne;

	@BeforeEach
	void setUp() throws Exception {
		houseRobberOne = new HouseRobberOne();
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void testCaseOne(int[] nums, int expected) {
		
		int actual = houseRobberOne.maxLootUsingBottomUpDP(nums);
		assertEquals(expected, actual);

	}
	
	@ParameterizedTest
	@MethodSource("providedTestCases")
	void testCaseTwo(int[] nums,int expected) {
		
		int actual = houseRobberOne.maxLootUsingSpaceOptimizedDP(nums);
		assertEquals(expected, actual);
	}

	private static Stream<Arguments> providedTestCases() {
		return Stream.of(Arguments.of(new int[] { 1, 2, 3, 1 }, 4), Arguments.of(new int[] { 2, 7, 9, 3, 1 }, 12));
	}

}
