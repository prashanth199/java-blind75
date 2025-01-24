package com.prashanth.blind75.arrays;

public class MaximumSubArrayUsingDivideAndConquer {

	public int getMaxSubArray(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		return divideAndConquer(nums, left, right);
	}

	private int divideAndConquer(int[] nums, int left, int right) {

		if (left == right) {
			return nums[left]; 
		}

		int mid = left + (right - left) / 2;

		int leftMax = divideAndConquer(nums, left, mid);
		int rightMax = divideAndConquer(nums, mid + 1, right);
		int crossMax = maxCrossingSum(nums, left, mid, right);

		return Math.max(Math.max(leftMax, rightMax), crossMax);

	}

	private int maxCrossingSum(int[] nums, int left, int mid, int right) {

		int leftSum = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = mid; i >= left; i--) {

			sum = sum + nums[i];
			leftSum = Math.max(leftSum, sum);
		}

		int rightSum = Integer.MIN_VALUE;
		sum = 0;

		for (int i = mid + 1; i <= right; i++) {

			sum = sum + nums[i];
			rightSum = Math.max(rightSum, sum);
		}

		return leftSum + rightSum;
	}
}
