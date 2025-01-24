package com.prashanth.blind75.arrays;

public class FindMinimumInRotatedSortedArray {

	/*
	 * Key Observations: 
	 * 1. The minimum element is the only element that is smaller
	 *    than its previous element (pivot point). 
	 * 2. In a rotated sorted array, the leftmost element is 
	 *    greater than the rightmost element, except when the array
	 *    is not rotated. 
	 * 3. We can use binary search to narrow down the range
	 *    containing the minimum element.
	 */

	public int findMin(int[] nums) {

		int left = 0, right = nums.length - 1;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] > nums[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}

		return nums[left];

	}

}
