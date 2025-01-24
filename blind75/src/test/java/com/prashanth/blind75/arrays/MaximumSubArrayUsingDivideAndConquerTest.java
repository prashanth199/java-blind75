package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumSubArrayUsingDivideAndConquerTest {

	private MaximumSubArrayUsingDivideAndConquer maximumSubArrayUsingDivideAndConquer;

	@BeforeEach
	void setUp() throws Exception {
		maximumSubArrayUsingDivideAndConquer = new MaximumSubArrayUsingDivideAndConquer();
	}

	@Test
	void test_case_one() {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int expected = 6;
		int actual = maximumSubArrayUsingDivideAndConquer.getMaxSubArray(nums);

		assertTrue(expected == actual);
	}

	@Test
	void test_case_two() {
		int[] nums = { 1 };

		int expected = 1;
		int actual = maximumSubArrayUsingDivideAndConquer.getMaxSubArray(nums);

		assertTrue(expected == actual);
	}

	@Test
	void test_case_three() {
		int[] nums = { 5, 4, -1, 7, 8 };

		int expected = 23;
		int actual = maximumSubArrayUsingDivideAndConquer.getMaxSubArray(nums);

		assertTrue(expected == actual);
	}

}
