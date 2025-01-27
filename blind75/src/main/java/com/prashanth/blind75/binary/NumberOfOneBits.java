package com.prashanth.blind75.binary;

public class NumberOfOneBits {

	private static final int[] lookupTable = new int[256];

	static {
		for (int i = 0; i < 256; i++) {
			lookupTable[i] = Integer.bitCount(i);
		}
	}

//Using Brian Kernighan’s Algorithm
//	Time Complexity O(no of 1 bits);
	public int hammingWeightUsingBriansAlgorithm(int n) {

		int count = 0;

		while (n != 0) {
			n = n & (n - 1); // removes lowest set bit;
			count++;
		}
		return count;
	}

//	Using Interative appoach
	public int hammingWeightUsingInterativeApproach(int n) {

		int count = 0;

		while (n != 0) {
			count = count + (n & 1);
			n = n >>> 1;
		}

		return count;

	}

//	Using Precomputed Table
	public int hammingWeightUsingPreComputedTable(int n) {
		return lookupTable[(n) & 0xFF] + lookupTable[(n >>> 8) & 0xFF] + lookupTable[(n >>> 16) & 0xFF]
				+ lookupTable[(n >>> 24) & 0xFF];

	}

}
