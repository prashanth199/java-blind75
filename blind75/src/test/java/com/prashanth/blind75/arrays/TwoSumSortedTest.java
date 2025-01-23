package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumSortedTest {

	private TwoSumSorted twoSumSorted;

	@BeforeEach
	void setUp() throws Exception {
		twoSumSorted = new TwoSumSorted();
	}

	@Test
	void test_case_one() {
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;

		int[] expected = new int[] { 1, 2 };
		int[] actual = twoSumSorted.findTwoSum(nums, target);

		assertArrayEquals(expected, actual);
	}

	@Test
	void test_case_two() {
		int[] nums = new int[] { 2, 3, 4 };
		int target = 6;

		int[] expected = new int[] { 1, 3 };
		int[] actual = twoSumSorted.findTwoSum(nums, target);

		assertArrayEquals(expected, actual);
	}

	@Test
	void test_case_three() {
		int[] nums = new int[] { -1, 0 };
		int target = -1;

		int[] expected = new int[] { 1, 2 };
		int[] actual = twoSumSorted.findTwoSum(nums, target);

		assertArrayEquals(expected, actual);
	}

}
