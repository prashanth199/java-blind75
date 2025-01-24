package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {
	
	private SearchInRotatedSortedArray searchInRotatedSortedArray;

	@BeforeEach
	void setUp() throws Exception {
		
		searchInRotatedSortedArray = new SearchInRotatedSortedArray();
	}

	@Test
	void test_case_one() {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		
		int expected = 4;
		int actual = searchInRotatedSortedArray.search(nums, target);
		
		assertTrue(expected==actual);
	}
	
	@Test
	void test_case_two() {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 3;
		
		int expected = -1;
		int actual = searchInRotatedSortedArray.search(nums, target);
		
		assertTrue(expected==actual);
	}
	
	@Test
	void test_case_three() {
		int[] nums = {1};
		int target = 0;
		
		int expected = -1;
		int actual = searchInRotatedSortedArray.search(nums, target);
		
		assertTrue(expected==actual);
	}

}
