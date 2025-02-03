package com.prashanth.blind75.dp;

import java.util.HashMap;

public class LongestCommonSubsequence {

	private HashMap<String, Integer> memo = new HashMap<String, Integer>();

	public int getLCSUsingDP(String text1, String text2) {
		int m = text1.length(), n = text2.length();
		int[][] dp = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++) {

			for (int j = 1; j <= n; j++) {

				if (text1.charAt(i - 1) == text2.charAt(j - 1)) {

					dp[i][j] = 1 + dp[i - 1][j - 1];

				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}

			}

		}

		return dp[m][n];
	}

	public int getLCSUsingOptimizedSpaceMethod(String text1, String text2) {
		int m = text1.length(), n = text2.length();
		
		int[] prev = new int[n+1];
		
		for(int i=1;i<=m;i++) {
			int[] curr = new int[n+1];
			for(int j=1;j<=n;j++) {
				
				if(text1.charAt(i-1)==text2.charAt(j-1)) {
					curr[j] = 1 + prev[j-1];
				}
				else {
					curr[j] = Math.max(prev[j], curr[j-1]);
				}
				
			}
			prev = curr;
		}
		
		return prev[n];
	}

//	Time Complexity of this algorithm is O(m*n);
//	Space Complexity of this algorithm is O(m*n)
	public int getLCSUsingRecursionWithMemoization(String text1, String text2) {

		return lcsHelperWithMemo(text1, text2, text1.length(), text2.length());
	}

//	Time Complexity of this algorithm is O(2^min(m,n)) where m and n are length of text1 and text2
//	Space Complexity of this algorithm is O(min(m,n), recursion stack space
	public int getLCSUsingRecursion(String text1, String text2) {

		return lcsHelperWithoutMemo(text1, text2, text1.length(), text2.length());
	}

	private int lcsHelperWithoutMemo(String text1, String text2, int m, int n) {
//		Base Condition if either of the string is empty return zero
		if (m == 0 || n == 0) {
			return 0;
		}

		int result;

//		Check For The Match
		if (text1.charAt(m - 1) == text2.charAt(n - 1)) {

			result = 1 + lcsHelperWithoutMemo(text1, text2, m - 1, n - 1);

		} else {
			result = Math.max(lcsHelperWithoutMemo(text1, text2, m - 1, n),
					lcsHelperWithoutMemo(text1, text2, m, n - 1));
		}

		return result;
	}

	private int lcsHelperWithMemo(String text1, String text2, int m, int n) {
//		Base Condition if either of the string is empty return zero
		if (m == 0 || n == 0) {
			return 0;
		}
		String key = m + "," + n;
// Check if the hashmap contains the key if yes return it 
		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		int result;

//		Check For the match	
		if (text1.charAt(m - 1) == text2.charAt(n - 1)) {

			result = 1 + lcsHelperWithMemo(text1, text2, m - 1, n - 1);

		} else {
			result = Math.max(lcsHelperWithMemo(text1, text2, m - 1, n), lcsHelperWithMemo(text1, text2, m, n - 1));
		}

		memo.put(key, result);

		return result;
	}

}
