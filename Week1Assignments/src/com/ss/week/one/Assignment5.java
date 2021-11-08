package com.ss.week.one;

public class Assignment5 {

	public static boolean groupSumClump(int start, int[] nums, int total) {
		if(start >= nums.length) {
			return total == 0;
		}
		
		int i = start;
		int clump = 0;
		while(i < nums.length && nums[start] == nums[i]) {
			clump += nums[i];
			i++;
		}
		
		if(groupSumClump(i, nums, total) || groupSumClump(i, nums, total-clump)) {
			return true;
		}
		
		return false;
		
	}

}
