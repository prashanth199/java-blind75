package com.prashanth.blind75.dp;

import java.util.HashMap;
import java.util.Map;

public class CombinationSumFour {

	private Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

	public int countCombinationsUsingTopDownApproach(int[] nums, int target) {
		// Base case: If the target is 0, there is exactly one combination (using no
		// numbers).
		if (target == 0) {
			return 1;
		}

		// If the result for the current target is already computed, return it from the
		// memo map.
		if (memo.containsKey(target)) {
			return memo.get(target);
		}
		// Initialize a counter to keep track of the number of valid combinations.
		int count = 0;
		/*
		 * Recurrence Relation dp[target] = sum(dp[target - num] for all num in nums
		 * where num <= target)
		 * 
		 */
		for (int num : nums) {

			if (target >= num) {

				count = count + countCombinationsUsingTopDownApproach(nums, target - num);
			}
		}

		memo.put(target, count);

		return count;
	}

	public int countCombinationsUsingBottomUpApproach(int[] nums, int target) {

		int[] dp = new int[target + 1];

		dp[0] = 1;

		for (int i = 1; i <= target; i++) {
			
			for(int num:nums) {
				
				if(i>=num) {
					
					dp[i] = dp[i] + dp[i-num];
					
				}
			}

		}

		return dp[target];
	}

}
