package com.prashanth.blind75.dp;

import java.util.HashMap;

/*
 * The number of ways to climb 'n' stairs 
 * is the sum of ways to climb 'n-1' and 'n-2' stairs. 
 * This forms the recurrence relation 
 * f(n) = f(n-1) + f(n-2)
 * */

public class ClimbingStairs {

	private HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

	public int climbStairsRecursive(int n) {

		/* if n==1 or n==2 return 1 or 2 (base cases) */
		if (n <= 2) {
			return n;
		}
		/*
		 * if n is greater than 2 compute f(n) using recurrence relation
		 */
		if (!memo.containsKey(n)) {

			memo.put(n, climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2));
		}

		return memo.get(n);

	}

	public int climbStairsDP(int n) {

		if (n <= 2) {
			return n;
		}

		int[] dp = new int[n + 1];

		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i < n + 1; i++) {

			dp[i] = dp[i - 1] + dp[i - 2];

		}

		return dp[n];

	}

	public int climbStairsSpaceOptimized(int n) {

		if (n <= 2) {
			return n;
		}

		int first = 1, second = 2;

		for (int i = 3; i < n + 1; i++) {

			int current = first + second;
			first = second;
			second = current;

		}
		
		return second;
	}

}
