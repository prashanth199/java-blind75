package com.prashanth.blind75.dp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CoinChange {

	/*
	 * dp[x] represents minimum amount of coins needed to make amount 'x' The
	 * recurrence relation is dp[x] = min(dp[x],dp[x-coin]+1) Base Case: dp[0]=0 It
	 * takes 0 coins to make an amount of 0
	 * 
	 * Initialize all other dp[x] to infinity or a very large value bcoz initially
	 * we assume its impossible to form that amount
	 */

	public int coinChange(int[] coins, int amt) {

		int[] dp = new int[amt + 1];

		Arrays.fill(dp, amt + 1);

		dp[0] = 0;

		for (int coin : coins) {

			for (int i = coin; i <= amt; i++) {

				dp[i] = Math.min(dp[i], dp[i - coin] + 1);
			}
		}

		return dp[amt] > amt ? -1 : dp[amt];

	}

	public int coinChangeUsingBFS(int[] coins, int amt) {

		if (amt == 0) {
			return 0;
		}

		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[amt + 1];

		visited[amt] = true;
		q.add(amt);

		int steps = 0; 

		while (!q.isEmpty()) {

			steps++;

			int size = q.size();

			for (int i = 0; i < size; i++) {
				int current = q.poll();
				for (int coin : coins) {
					int next = current - coin;

					if (next == 0) {
						return steps;
					}
					if (next > 0 && !visited[next]) {
						visited[next] = true;
						q.add(next);
					}
				}
			}

		}

		return -1;

	}

}
