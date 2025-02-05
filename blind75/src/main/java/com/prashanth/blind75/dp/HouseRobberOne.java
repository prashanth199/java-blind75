package com.prashanth.blind75.dp;

public class HouseRobberOne {
	
	/*
	 * Recurrence Relation 
	 * Let dp[i] be the maximum money robbed up to house 'i'. 
	 * We have two choices at each house:
	 * 		1. Skip the current house → Take dp[i - 1] 
	 * 		2. Rob the current house → Add its value to dp[i - 2] 
	 * dp[i]=max(dp[i−1],dp[i−2]+nums[i]) 
	 * 
	 * Base Cases 
	 * dp[0] = nums[0] (Only one house to rob) 
	 * dp[1] = max(nums[0], nums[1]) (Pick the best out of the first two houses)
	 */
	public int maxLootUsingBottomUpDP(int[] nums) {

		int n = nums.length;

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		int[] dp = new int[n];

//		Base Cases 		
		dp[0] = nums[0]; // Only One House to rob
		dp[1] = Math.max(nums[0], nums[1]); // Pick the best out of first 2 houses

		for (int i = 2; i < n; i++) {

			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}

		return dp[n - 1];

	}
	
	public int maxLootUsingSpaceOptimizedDP(int[] nums) {
		
		int n = nums.length;

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		int previousPrev = nums[0];
		int previous = Math.max(nums[0], nums[1]);
		
		for(int i=2;i<n;i++) {
			
			int current = Math.max(previous,previousPrev+nums[i]);
			previousPrev = previous;
			previous = current;
			
		}
		
		
		return previous;
		
	}

}
