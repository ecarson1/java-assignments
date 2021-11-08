package com.ss.week.one;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestAssignment5 {
	
	@Test
	public void testGroupSumClump(){
		int[] nums1 = {2, 4, 8};
		int[] nums2 = {1, 2, 4, 8, 1};
		int[] nums3 = {2, 4, 4, 8};
		int[] nums4 = {1};
		int[] nums5 = {2, 4, 8, -1};
		int[] nums6 = {2, 4, 8, -1, -1};
		
		
		assertTrue(Assignment5.groupSumClump(0, nums1, 10));
		assertTrue(Assignment5.groupSumClump(0, nums2, 14));
		assertFalse(Assignment5.groupSumClump(0, nums3, 14));
		assertFalse(Assignment5.groupSumClump(0, nums4, 2));
		assertTrue(Assignment5.groupSumClump(0, nums5, 5));
		assertFalse(Assignment5.groupSumClump(0, nums6, 5));
		
	}

}
