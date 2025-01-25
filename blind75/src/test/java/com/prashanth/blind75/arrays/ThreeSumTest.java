package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ThreeSumTest {

	private ThreeSum threeSum;

	@BeforeEach
	void setUp() throws Exception {
		threeSum = new ThreeSum();
	}

	@Test
	void test_case_one() {
		int[] nums = { -1, 0, 1, 2, -1, -4 };

		List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
		List<List<Integer>> actual = threeSum.getThreeSum(nums);

		assertEquals(expected, actual);
	}

	@Test
	void test_case_two() {
		int[] nums = { 0, 1, 1 };

		List<List<Integer>> expected = List.of();
		List<List<Integer>> actual = threeSum.getThreeSum(nums);

		assertEquals(expected, actual);
	}

	  
	@Test
	void test_case_three() {
		int[] nums = { 0, 0, 0 };

		List<List<Integer>> expected = List.of(List.of(0, 0, 0));
		List<List<Integer>> actual = threeSum.getThreeSum(nums);

		assertEquals(expected, actual);
	}

}
