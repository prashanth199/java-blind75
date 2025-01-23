package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {

	private TwoSum twoSum;

	@BeforeEach
	void setUp() throws Exception {
		twoSum = new TwoSum();
	}

	@Test
	void test_case_one() {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;

		int[] expected = new int[] { 0, 1 };
		int[] actual = twoSum.findTwoSum(nums, target);

		assertArrayEquals(expected, actual);
	}

	@Test
	void test_case_two() {
		int[] nums = new int[] { 3, 2, 4 };
		int target = 6;

		int[] expected = new int[] { 1, 2 };
		int[] actual = twoSum.findTwoSum(nums, target);

		assertArrayEquals(expected, actual);

	}

	@Test
	void test_case_three() {
		int[] nums = new int[] { 3, 3 };
		int target = 6;

		int[] expected = new int[] { 0, 1 };
		int[] actual = twoSum.findTwoSum(nums, target);

		assertArrayEquals(expected, actual);
	}

}
