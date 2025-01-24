package com.prashanth.blind75.arrays;

public class MaximumSubarray {

	public int getMaxSubArray(int[] nums) {

		int maxCurrent = nums[0];
		int maxGlobal = nums[0];

		for (int i = 1; i < nums.length; i++) {
			maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
			maxGlobal = Math.max(maxCurrent, maxGlobal);
		}
		
		return maxGlobal;
	}

}
