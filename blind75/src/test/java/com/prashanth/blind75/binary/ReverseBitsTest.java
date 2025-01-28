package com.prashanth.blind75.binary;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ReverseBitsTest {

	private ReverseBits reverseBits;

	@BeforeEach
	void setUp() throws Exception {

		reverseBits = new ReverseBits();
	}

	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_case_one(int n,int expected) {
		
		int actual = reverseBits.reverseBits(n);
		
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@MethodSource("providedTestCases")
	void test_case_two(int n,int expected) {
		
		int actual = reverseBits.reverseBitsUsingPreComputedLookup(n);
		
		assertEquals(expected, actual);
	}

	private static Stream<Arguments> providedTestCases() {

		return Stream.of(Arguments.of(0b00000010100101000001111010011100, 0b00111001011110000010100101000000),
				Arguments.of(0b11111111111111111111111111111101, 0b10111111111111111111111111111111));
	}

}
