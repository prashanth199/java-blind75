package com.prashanth.blind75.arrays;

public class MaximumProductSubarray {

	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public int maxProduct(int[] nums) {

		int maxProduct = nums[0];
		int minProduct = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] < 0) {
				swap(maxProduct, minProduct);
			}

			maxProduct = Math.max(nums[i], nums[i] * maxProduct);
			minProduct = Math.min(nums[i], nums[i] * minProduct);
			result = Math.max(result, maxProduct);
		}
		
		return result;

	}
}
