package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindMinimumInRotatedSortedArrayTest {
	
	private FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray;

	@BeforeEach
	void setUp() throws Exception {
		findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
	}

	@Test
	void test_case_one() {
		int[] nums = {3,4,5,1,2};
		
		int expected = 1;
		int actual = findMinimumInRotatedSortedArray.findMin(nums);
		
		assertTrue(expected==actual);
	}
	
	@Test
	void test_case_two() {
		int[] nums = {4,5,6,7,0,1,2};
		
		int expected = 0;
		int actual = findMinimumInRotatedSortedArray.findMin(nums);
		
		assertTrue(expected==actual);
		
	}
	
	@Test
	void test_case_three() {
		int[] nums = {11,13,15,17};
		
		int expected = 11;
		int actual = findMinimumInRotatedSortedArray.findMin(nums);
		
		assertTrue(expected==actual);
	}

}
