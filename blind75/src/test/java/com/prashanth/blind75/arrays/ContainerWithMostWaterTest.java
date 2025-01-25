package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

	private ContainerWithMostWater containerWithMostWater;

	@BeforeEach
	void setUp() throws Exception {
		containerWithMostWater = new ContainerWithMostWater();
	}

	@Test
	void test_case_one() {
		int[] nums = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int expected = 49;
		int actual = containerWithMostWater.maxArea(nums);

		assertTrue(expected == actual);
	}

	@Test
	void test_case_two() {
		int[] nums = { 1, 1 };

		int expected = 1;
		int actual = containerWithMostWater.maxArea(nums);

		assertTrue(expected == actual);
	}

}
