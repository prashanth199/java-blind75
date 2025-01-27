package com.prashanth.blind75.binary;

public class CountingBits {

	/*
	 * Key Idea For any number i, the number of 1s in its binary representation can
	 * be derived from a smaller number: If i is even, the number of 1s is the same
	 * as i / 2 (right-shifting i by 1). If i is odd, the number of 1s is 1 + the
	 * number of 1s in i / 2. This gives the recurrence relation: ans[i] =
	 * ans[i >> 1] + ( 𝑖 & 1 )
	 */

	public int[] countBits(int n) {

		int[] result = new int[n + 1];

		for (int i = 1; i < n + 1; i++) {

			result[i] = result[i >> 1] + (i & 1);
		}

		return result;

	}

}
