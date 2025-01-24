package com.prashanth.blind75.arrays;

public class SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {

		int left = 0, right = nums.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;

			}

//			if the left half is sorted
			if (nums[left] <= nums[mid]) {

//				Check if the target number is between the sorted left half
//				if yes update the right pointer to mid-1 else update left pointer to mid+1
				if (target >= nums[left] && target < nums[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}

			}
//			if the right half is sorted
			else {
//				Check if the target number is between the sorted right half 
//				If yes update the left pointer to mid+1  else update the right pointer to mid-1
				if (target > nums[mid] && target <= nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}

			}

		}
		
		return -1;
	}
}
