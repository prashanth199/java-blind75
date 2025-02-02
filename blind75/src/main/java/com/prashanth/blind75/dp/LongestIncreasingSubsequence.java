package com.prashanth.blind75.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int n = nums.length;

		/*
		 * Create a dp array where dp[i] represents the length of LIS ending at index i.
		 */
		int[] dp = new int[n];

		int maxLIS = 1;
		/*
		 * Initialize all dp[i] = 1 because every element is a subsequence of length 1.
		 */
		Arrays.fill(dp, 1);

		for (int i = 1; i < n; i++) {
			/* For each pair (i, j), where j < i, update dp[i] if nums[i] > nums[j]. */
			for (int j = 0; j < i; j++) {

				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}

				maxLIS = Math.max(maxLIS, dp[i]);
			}
		}

		return maxLIS;

	}

	public int lengthOfLISUsingBinarySearch(int[] nums) {

		List<Integer> lis = new ArrayList<Integer>();

		lis.add(nums[0]);

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] > lis.get(lis.size() - 1)) {
				lis.add(nums[i]);

			} else {

				int index = Collections.binarySearch(lis, nums[i]);

				if (index < 0) {
					int index_to_replaced_current_element = -(index + 1);

					lis.set(index_to_replaced_current_element, nums[i]);

				}

			}

		}

		return lis.size();
	}

}
