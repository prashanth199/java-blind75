package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

	private ProductOfArrayExceptSelf productOfArrayExceptSelf;

	@BeforeEach
	void setUp() throws Exception {
		productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
	}

	@Test
	void test_case_one() {
		int[] nums = new int[] { 1, 2, 3, 4 };

		int[] expected = new int[] { 24, 12, 8, 6 };
		int[] actual = productOfArrayExceptSelf.productExceptSelfUsingPrefixSuffix(nums);
		

		assertArrayEquals(expected, actual);

	}

	@Test
	void test_case_two() {
		int[] nums = new int[] { -1, 1, 0, -3, 3 };

		int[] expected = new int[] { 0, 0, 9, 0, 0 };
		int[] actual = productOfArrayExceptSelf.productExceptSelfUsingPrefixSuffix(nums);

		assertArrayEquals(expected, actual);
	}

	@Test
	void test_case_three() {
		int[] nums = new int[] { 1, 2, 3, 4 };

		int[] expected = new int[] { 24, 12, 8, 6 };
		int[] actual = productOfArrayExceptSelf.productExceptSelf(nums);

		assertArrayEquals(expected, actual);

	}

	@Test
	void test_case_four() {
		int[] nums = new int[] { -1, 1, 0, -3, 3 };

		int[] expected = new int[] { 0, 0, 9, 0, 0 };
		int[] actual = productOfArrayExceptSelf.productExceptSelf(nums);

		assertArrayEquals(expected, actual);
	}

}
