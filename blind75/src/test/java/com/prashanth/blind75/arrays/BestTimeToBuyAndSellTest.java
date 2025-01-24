package com.prashanth.blind75.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellTest {
	
	private BestTimeToBuyAndSell bestTimeToBuyAndSell;

	@BeforeEach
	void setUp() throws Exception {
		bestTimeToBuyAndSell = new BestTimeToBuyAndSell();
	}

	@Test
	void test_case_one() {
		int[] prices = new int[] {7,1,5,3,6,4};
		
		int expected = 5;
		int actual = bestTimeToBuyAndSell.getMaxProfit(prices);
		
		assertTrue(expected==actual);
	}
	
	@Test
	void test_case_two() {
		int[] prices = new int[] {7,6,4,3,1};
		
		int expected = 0;
		int actual = bestTimeToBuyAndSell.getMaxProfit(prices);
		
		assertTrue(expected==actual);
	}

}
