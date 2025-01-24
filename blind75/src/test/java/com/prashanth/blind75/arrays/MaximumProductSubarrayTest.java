package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumProductSubarrayTest {

	private MaximumProductSubarray maximumProductSubarray;

	@BeforeEach
	void setUp() throws Exception {
		maximumProductSubarray = new MaximumProductSubarray();
	}

	@Test
	void test_case_one() {
		int[] nums = { 2, 3, -2, 4 };
		
		int expected = 6;
		int actual = maximumProductSubarray.maxProduct(nums);
		
		assertTrue(expected==actual);

	}
	
	@Test
	void test_case_two() {
		int[] nums = { -2, 0, -1 };
		
		int expected = 0;
		int actual = maximumProductSubarray.maxProduct(nums);
		
		assertTrue(expected==actual);
	}

}
