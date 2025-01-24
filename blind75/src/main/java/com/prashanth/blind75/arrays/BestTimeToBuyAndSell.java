package com.prashanth.blind75.arrays;

public class BestTimeToBuyAndSell {

	public int getMaxProfit(int[] prices) {

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {

			minPrice = Math.min(price, minPrice);
			
			int profit = price - minPrice;
			
			maxProfit = Math.max(maxProfit, profit);
		}
		
		return maxProfit;
	}

}
