package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {
	
	private ContainsDuplicate containsDuplicate;

	@BeforeEach
	void setUp() throws Exception {
		containsDuplicate = new ContainsDuplicate();
	}

	@Test
	void test_case_one() {
		int[] nums = new int[] {1,2,3,1};
		
		boolean expected = true;
		boolean actual = containsDuplicate.containsDuplicate(nums);
		
		assertTrue(expected==actual);
	}
	
	@Test
	void test_case_two() {
		int[] nums = new int[] {1,2,3,4};
		
		boolean expected = false;
		boolean actual = containsDuplicate.containsDuplicate(nums);
		
		assertTrue(expected==actual);
	}
	
	@Test
	void test_case_three() {
		int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
		
		boolean expected = true;
		boolean actual = containsDuplicate.containsDuplicate(nums);
		
		assertTrue(expected==actual); 
	}

}
