package com.prashanth.blind75.binary;

public class ReverseBits {

	private static int[] cache = new int[256];

	static {

		for (int i = 0; i < 256; i++) {
			cache[i] = reverseByte(i);
		}
	}

	public int reverseBits(int n) {

		int result = 0;

		for (int i = 0; i < 32; i++) {

			/* Extract the least significant bit of "n" using n & 1 */
			int bit = n & 1;

			/*
			 * Left-shift the result to make room for the next bit. and add extracted bit to
			 * the result
			 */
			result = (result << 1) | bit;
			/*
			 * Right-shift 𝑛 to process the next bit.
			 */
			n = n >>> 1;
		}

		return result;
	}

	public int reverseBitsUsingPreComputedLookup(int n) {

		return (cache[n & 0xFF] << 24) | (cache[(n >> 8) & 0xFF] << 16) | (cache[(n >> 16) & 0xFF] << 8)
				| (cache[(n >> 24) & 0xFF]);

	}

	private static int reverseByte(int n) {
		int result = 0;

		for (int i = 0; i < 8; i++) {

			/* Extract the least significant bit of "n" using n & 1 */
			int bit = n & 1;

			/*
			 * Left-shift the result to make room for the next bit. and add extracted bit to
			 * the result
			 */
			result = (result << 1) | bit;
			/*
			 * Right-shift 𝑛 to process the next bit.
			 */
			n = n >>> 1;
		}

		return result;

	}

}
