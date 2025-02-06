package com.prashanth.blind75.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Comparison of Different Approaches for Unique Paths Problem:
 * 
 * 1. Recursion (Brute Force) Time Complexity: O(2^(m+n)) Space Complexity:
 * O(m+n) Notes: Slow for large grids
 * 
 * 2. Memoization (Top-Down) Time Complexity: O(m * n) Space Complexity: O(m *
 * n) Notes: Faster, avoids recomputation
 * 
 * 3. DP (Bottom-Up) Time Complexity: O(m * n) Space Complexity: O(m * n) Notes:
 * Standard DP approach
 * 
 * 4. DP (Optimized) Time Complexity: O(m * n) Space Complexity: O(n) Notes:
 * Saves space using 1D array
 * 
 * 5. Math (Best) Time Complexity: O(m) Space Complexity: O(1) Notes: Best
 * approach, uses combinatorics
 */
public class UniquePaths {

	private Map<String, Integer> memo = new HashMap<String, Integer>();

	/*
	 * Brute Force Approach Using Recursion The idea is:
	 * 
	 * The robot can move right (m, n-1) or down (m-1, n). If m == 1 or n == 1,
	 * return 1 (only one way to reach the target). Otherwise, recursively calculate
	 * paths.
	 */
	public int calculateUniquePathsUsingBruteForce(int m, int n) {

		if (m == 1 || n == 1) {
			return 1;
		}

		return calculateUniquePathsUsingBruteForce(m, n - 1) + calculateUniquePathsUsingBruteForce(m - 1, n);

	}

	/*
	 * Top-Down DP (Memoization) Approach
	 * 
	 * To optimize recursion, store results in a memo table to avoid recomputation.
	 */
	public int calculateUniquePathsUsingTopDownApproachOfDP(int m, int n) {

		if (m == 1 || n == 1) {
			return 1;
		}

		String key = m + "," + n;

		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		int result = calculateUniquePathsUsingTopDownApproachOfDP(m, n - 1)
				+ calculateUniquePathsUsingTopDownApproachOfDP(m - 1, n);

		memo.put(key, result);

		return result;

	}

	/*
	 * Bottom-Up DP (Tabulation)
	 * 
	 * Instead of recursion, use a 2D DP table where: dp[i][j] = dp[i-1][j] +
	 * dp[i][j-1]
	 * 
	 * Base case: dp[0][j] = 1, dp[i][0] = 1 (Only one way to reach first
	 * row/column)
	 */
	public int calculateUniquePathsUsingBottomUpApproachOfDP(int m, int n) {

		int[][] dp = new int[m][n];

		// Base case: Fill the first row and first column with 1
		// There's only one way to reach any cell in the first row or first column
		for (int i = 0; i < m; i++) {
			dp[i][0] = 1;// Only one way to reach cells in the first column (move down)
		}

		for (int i = 0; i < n; i++) {
			dp[0][i] = 1;// Only one way to reach cells in the first row (move right)
		}

		// Fill the DP table using the recurrence relation:
		// dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
		// The number of ways to reach cell (i, j) is the sum of:
		// - The number of ways to reach the cell above it (i-1, j)
		// - The number of ways to reach the cell to the left of it (i, j-1)
		for (int i = 1; i < m; i++) {

			for (int j = 1; j < n; j++) {

				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		return dp[m - 1][n - 1];

	}

	/*
	 * Space-Optimized DP (1D Array)
	 * 
	 * Instead of using a 2D dp table, we only store the previous row since we only
	 * need dp[j] from the last row
	 */
	public int calculateUniquePathsUsingBottomApproachOfDPSpaceOptimization(int m, int n) {
		// Use 1D array instead of 2D for space optimization
		int[] dp = new int[n];

		// Initialize first row with 1s since there's only one way to reach each cell in
		// first row
		for (int j = 0; j < n; j++) {
			dp[j] = 1;
		}

		// Process each row starting from second row
		for (int i = 1; i < m; i++) {
			// Process each column starting from second column
			// First column always remains 1 since there's only one way to reach it
			for (int j = 1; j < n; j++) {
				// Current cell value = cell above (dp[j]) + cell to the left (dp[j-1])
				dp[j] += dp[j - 1];
			}
		}

		// Return value in bottom-right cell
		return dp[n - 1];
	}

	/**
	 * Solves the unique paths problem using combinatorics formula: 
	 * C(m+n-2, n-1) or C(m+n-2, m-1) 
	 * This is because to reach from top-left to bottom-right in an m×n grid: 
	 * 	- We need exactly (m-1) down moves and (n-1) right moves 
	 * 	- Total moves needed = (m-1) + (n-1) = m+n-2 
	 * 	- We just need to choose positions for either down or right moves
	 */
	public int calculateUniquePathsUsingCombinatorics(int m, int n) {
		// We need to calculate C(m+n-2, min(m-1, n-1))
        // Using smaller value in combination reduces multiplication operations
		int N = m + n - 2; // total moves needed
		int r = Math.min(m - 1, n - 1);  // we choose minimum for efficiency
		
		// Use long to avoid overflow
		long result = 1;
		
		// Calculate C(N,r) = N!/(r!(N-r)!)
        // We can do this without calculating full factorials
		
		/*
		 * example Traditional expansion: C(5,3) = (5 * 4 * 3)/(3 * 2 * 1)
		 * 
		 * Our formula (N-r+1)/i builds this as: 
		 * 	i=1: (5-3+1)/1 = 3/1 	// First multiplication 
		 * 	i=2: (5-3+2)/2 = 4/2 	// Second multiplication 
		 * 	i=3: (5-3+3)/3 = 5/3 	// Third multiplication
		 * 
		 * This gives us (3/1 * 4/2 * 5/3) = 10
		 */
		for (int i = 1; i <= r; i++) {

			result = result * (N - r + i) / i;

		}

		return (int) result;

	}

}
