package com.prashanth.blind75.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> getThreeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			if (i != 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				// logic here is nums[i] + nums[left] + nums[right]= 0 so nums[left]+nums[right]
				// = -nums[i]
				int sum = nums[left] + nums[right];
				int target = -nums[i];

				if (sum == target) {
					List<Integer> triplets = List.of(nums[i], nums[left], nums[right]);
					result.add(triplets);

					while (left < right && nums[left] == nums[left + 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right - 1]) {
						right--;
					}

					left++;
					right--;

				} else if (sum < target) {
					left++;

				} else {
					right--;
				}

			}

		}

		return result;

	}

}
