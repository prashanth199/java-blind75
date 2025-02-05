package com.prashanth.blind75.dp;

public class HouseRobberTwo {

	/*
	 * House Robber II (LeetCode 213) This is a follow-up to the House Robber I
	 * problem, but with an additional constraint:
	 * 
	 * The houses are arranged in a circle, meaning the first and last houses are
	 * adjacent and cannot be robbed together.
	 * 
	 * Key Observations 
	 * Since the houses are in a circle, if we rob the first house,
	 * we cannot rob the last house, and vice versa. 
	 * Thus, we have two cases:
	 * 
	 * 		Ignore the last house → Solve for nums[0:n-2] 
	 * 		Ignore the first house → Solve for nums[1:n-1] 
	 * Finally, we take the maximum of both cases:
	 * 		max(rob(nums[0:n−2]),rob(nums[1:n-1]))
	 */
	public int getMaxLoot(int[] nums) {
		
		int n = nums.length;
		
		if(n==0) {
			return 0;
		}
		
		if(n==1) {
			return 1;
		}
		
		return Math.max(calculateMaxLoot(nums, 0, n-2), calculateMaxLoot(nums, 1, n-1));
	}

	public int calculateMaxLoot(int[] nums, int start, int end) {

		int previousPrev = 0;
		int previous = 0;

		for (int i = start; i <= end; i++) {

			int current = Math.max(previous, previousPrev + nums[i]);
			previousPrev = previous;
			previous = current;
		}

		return previous;

	}

}
