package com.prashanth.blind75.dp;

public class DecodeWays {

	/*
	 * Approach to Solve the Problem Dynamic Programming (DP) Approach:
	 * 
	 * We can use a dynamic programming array dp where dp[i] represents the number
	 * of ways to decode the substring s[0...i-1].
	 * 
	 * The idea is to build the solution incrementally by considering the last one
	 * or two digits.
	 * 
	 * Base Cases:
	 * 
	 * dp[0] = 1: An empty string has one way to decode (doing nothing).
	 * 
	 * dp[1] = 1 if s[0] != '0', otherwise 0.
	 * 
	 * Recurrence Relation:
	 * 
	 * For each position i in the string:
	 * 
	 * If the current digit (s[i-1]) is not '0', it can be decoded as a single
	 * character. Add dp[i-1] to dp[i].
	 * 
	 * If the last two digits (s[i-2] and s[i-1]) form a valid number between 10 and
	 * 26, add dp[i-2] to dp[i].
	 * 
	 * Final Answer:
	 * 
	 * The answer will be dp[n], where n is the length of the string.
	 */

	public int decodeWays(String s) {

		int n = s.length();

		// No valid decoding for leading '0'
		if (s.charAt(0) == '0') {

			return 0;
		}

		int[] dp = new int[n + 1];

		dp[0] = 1; // Base Case: Empty String has one way to decode
		dp[1] = 1; // First Character is valid (already checked)

		for (int i = 2; i <= n; i++) {

			int digitOne = Integer.parseInt(s.substring(i - 1, i));
			int digitTwo = Integer.parseInt(s.substring(i - 2, i));

			if (digitOne >= 1 && digitOne <= 9) {
				dp[i] = dp[i] + dp[i - 1];// Add ways from one digit decoding
			}

			if (digitTwo >= 10 && digitTwo <= 26) {
				dp[i] = dp[i] + dp[i - 2]; // Add ways from two digit decoding
			}

		}

		return dp[n];

	}

	public int decodeWaysUsingSpaceOptimizedDP(String s) {

		int n = s.length();

		if (s.charAt(0) == '0') {
			return 0;
		}
		
		// Base Case: Empty String can be decoded in one way
		// equivalent to dp[i-2]
		int previousPrev = 1; 
		// First Character is valid(already checked)
		// equivalent to dp[i-1]
		int previous = 1; 
		
		for (int i = 1; i < n; i++) {
			int current = 0;
			int oneDigit = Integer.parseInt(s.substring(i, i+1));
			int twoDigit = Integer.parseInt(s.substring(i-1,i+1));
			
			if(oneDigit>=1 && oneDigit<=9) {
				
				current = current + previous;
			}
			
			if(twoDigit>=10 && twoDigit<=26) {
				
				current = current + previousPrev;
			}
			
			previousPrev = previous;
			previous = current;

		}

		return previous;

	}

}
