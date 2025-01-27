package com.prashanth.blind75.binary;

public class SumOfTwoIntegers {

	public int getSum(int a, int b) {

		while (b != 0) {
			int sumWithoutCarry = a ^ b;
			int carry = (a & b) << 1;
			
			a = sumWithoutCarry;
			b = carry;
		}
		
		return a;
	}

}
