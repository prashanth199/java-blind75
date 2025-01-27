package com.prashanth.blind75.binary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class NumberOfOneBitsTest {
	
	private NumberOfOneBits numberOfOneBits;

	@BeforeEach
	void setUp() throws Exception {
		
		numberOfOneBits = new NumberOfOneBits();
	}

	@ParameterizedTest
	@CsvSource(value = {"11,3","128,1","2147483645,30"})
	void test_case_one(int input,int expected) {
		int actual = numberOfOneBits.hammingWeightUsingBriansAlgorithm(input);
		
		assertTrue(expected==actual);
	}
	
	@ParameterizedTest
	@CsvSource(value = {"11,3","128,1","2147483645,30"})
	void test_case_two(int input,int expected) {
		int actual = numberOfOneBits.hammingWeightUsingInterativeApproach(input);
		
		assertTrue(expected==actual);
		
	}
	
	@ParameterizedTest
	@CsvSource(value = {"11,3","128,1","2147483645,30"})
	void test_case_three(int input,int expected) {
		int actual = numberOfOneBits.hammingWeightUsingPreComputedTable(input);
		
		assertTrue(expected==actual);
		
	}
	
	

}
