package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestIncreasingSubsequenceTest {

	private LongestIncreasingSubsequence longestIncreasingSubsequence;

	@BeforeEach
	void setUp() throws Exception {
		longestIncreasingSubsequence = new LongestIncreasingSubsequence();
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_case_one(int[] nums, int expected) {
		int actual = longestIncreasingSubsequence.lengthOfLIS(nums);

		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_case_two(int[] nums, int expected) {
		int actual = longestIncreasingSubsequence.lengthOfLISUsingBinarySearch(nums);

		assertEquals(expected, actual);
	}

	private static Stream<Arguments> providedTestCases() {
		return Stream.of(Arguments.of(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }, 4),
				Arguments.of(new int[] { 0, 1, 0, 3, 2, 3 }, 4), Arguments.of(new int[] { 7, 7, 7, 7, 7, 7, 7 }, 1));
	}

}
