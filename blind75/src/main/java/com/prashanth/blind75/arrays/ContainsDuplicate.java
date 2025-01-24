package com.prashanth.blind75.arrays;

import java.util.HashSet;

public class ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
		
		HashSet<Integer> numSet = new HashSet<Integer>();
		
		for(int num: nums) {
			
			if(numSet.contains(num)) {
				return true;
			}
			numSet.add(num);
		}
		
		return false;
	}

}
