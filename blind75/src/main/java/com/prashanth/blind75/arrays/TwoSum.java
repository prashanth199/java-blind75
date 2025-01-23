package com.prashanth.blind75.arrays;

import java.util.HashMap;

public class TwoSum {

	public int[] findTwoSum(int[] nums, int target) {

		HashMap<Integer, Integer> numIndexMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (numIndexMap.containsKey(complement)) {

				return new int[] { numIndexMap.get(complement), i };

			}
			numIndexMap.put(nums[i], i);

		}
		return new int[] {};

	}
}
