package com.prashanth.blind75.arrays;

public class ContainerWithMostWater {

	public int maxArea(int[] nums) {

		int left = 0, right = nums.length - 1;
		int maxArea = 0;

		while (left < right) {
			int area = (right - left) * Math.min(nums[left], nums[right]);
			
			maxArea = Math.max(maxArea, area);
			
			if(nums[left]<nums[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		
		return maxArea;

	}
}
