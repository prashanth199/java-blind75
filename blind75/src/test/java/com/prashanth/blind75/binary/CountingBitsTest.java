package com.prashanth.blind75.binary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CountingBitsTest {

	private CountingBits countingBits;

	@BeforeEach
	void setUp() throws Exception {
		countingBits = new CountingBits();
	}

	@ParameterizedTest
	@MethodSource("provideTestCases")
	void test_case_one(int n, int[] expected) {

		int[] actual = countingBits.countBits(n);

		assertArrayEquals(expected, actual);

	}

	private static Stream<Arguments> provideTestCases() {
		return Stream.of(Arguments.of(2, new int[] { 0, 1, 1 }), Arguments.of(5, new int[] { 0, 1, 1, 2, 1, 2 }));
	}

}
