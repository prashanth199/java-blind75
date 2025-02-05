package com.prashanth.blind75.dp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DecodeWaysTest {

	private DecodeWays decodeWays;

	@BeforeEach
	void setUp() throws Exception {
		decodeWays = new DecodeWays();
	}

	@ParameterizedTest
	@MethodSource("provideTestCases")
	void testCaseOne(String s,int expected) {
		int actual = decodeWays.decodeWays(s);
		assertEquals(expected, actual);
		
	}
	
	@ParameterizedTest
	@MethodSource("provideTestCases")
	void testCaseTwo(String s,int expected) {
		int actual = decodeWays.decodeWaysUsingSpaceOptimizedDP(s);
		assertEquals(expected, actual);
		
	}

	private static Stream<Arguments> provideTestCases() {
		return Stream.of(Arguments.of("12", 2), Arguments.of("226", 3), Arguments.of("06", 0));
	}

}
