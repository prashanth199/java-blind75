package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LongestCommonSubsequenceTest {

	private LongestCommonSubsequence longestCommonSubsequence;

	@BeforeEach
	void setUp() throws Exception {

		longestCommonSubsequence = new LongestCommonSubsequence();
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	@DisplayName("LCS Using DP")
	void testCaseOne(String text1, String text2, int expected) {
		int actual = longestCommonSubsequence.getLCSUsingDP(text1,text2);
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@MethodSource("providedTestCases")
	@DisplayName("LCS Using Optimized Space")
	void testCaseTwo(String text1,String text2, int expected) {
		int actual = longestCommonSubsequence.getLCSUsingOptimizedSpaceMethod(text1,text2);
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@MethodSource("providedTestCases")
	@DisplayName("LCS Using Recursion With Memoization")
	void testCaseThree(String text1,String text2, int expected) {
		int actual = longestCommonSubsequence.getLCSUsingRecursionWithMemoization(text1,text2);
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@MethodSource("providedTestCases")
	@DisplayName("LCS Using Recursion (Brute Force)")
	void testCaseFour(String text1,String text2, int expected) {
		int actual = longestCommonSubsequence.getLCSUsingRecursion(text1,text2);
		
		assertEquals(expected, actual);
	}
	

	
	

	private static Stream<Arguments> providedTestCases() {
		return Stream.of(Arguments.of("abcde", "ace", 3), Arguments.of("abc", "abc", 3), Arguments.of("abc", "def", 0));
	}

}
