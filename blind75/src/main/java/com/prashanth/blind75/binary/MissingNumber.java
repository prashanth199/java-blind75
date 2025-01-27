package com.prashanth.blind75.binary;

public class MissingNumber {
	/*
	 * Key Idea The sum of the first 𝑛 n natural numbers is:
	 * 
	 * sum = 𝑛 ⋅ ( 𝑛 + 1 )/ 2 ​
	 * 
	 * If you calculate this sum and subtract the sum of elements in the array, the
	 * result will be the missing number.
	 * 
	 * 
	 */
	public int findMissingNumberUsingMathematicalFormula(int[] nums) {

		int n = nums.length;
		int totalSum = n * (n + 1) / 2;
		int arraySum = 0;

		for (int num : nums) {

			arraySum = arraySum + num;

		}

		return totalSum - arraySum;

	}

	/*
	 * Key Idea Using the properties of XOR:
	 * 
	 * 𝑎 ⊕ 𝑎 = 0 
	 * 𝑎 ⊕ 0 = 𝑎 
	 * 
	 * If you XOR all numbers from 0 to 𝑛 and XOR all
	 * elements in the array, the duplicate numbers cancel out, leaving only the
	 * missing number.
	 */

	public int findMissingNumberUsingXOR(int[] nums) {

		int n = nums.length;
		int xor = 0;

		for (int i = 0; i < n + 1; i++) {

			xor = xor ^ i;
		}

		for (int num : nums) {

			xor = xor ^ num;

		}
		
		return xor;

	}

}
