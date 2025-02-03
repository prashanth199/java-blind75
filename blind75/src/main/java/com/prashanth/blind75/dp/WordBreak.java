package com.prashanth.blind75.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public boolean isWordBrakPossible(String s, List<String> wordDict) {

		int n = s.length();

		boolean[] dp = new boolean[n + 1];

		Set<String> wordSet = new HashSet<String>(wordDict);

		dp[0] = true;// Base case: empty string can always be segmented

		for (int i = 1; i <= n; i++) {

			for (int j = 0; j < i; j++) {

				if (dp[j] && wordSet.contains(s.substring(j, i))) {

					dp[i] = true;
					break;

				}

			}
		}

		return dp[n];
	}

}
