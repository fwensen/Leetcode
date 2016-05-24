package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MaximumSubarrayTest extends TestCase{

	MaximumSubarray ms;
	public MaximumSubarrayTest(String method) {
		super(method);
	}
	
	
	public void setUp() {
		ms = new MaximumSubarray();
	}
	
	public void testMaxSubArray() {
		
		int [] nums1 = {1};
		int [] nums2 = {1,2,3,-3,-3,-2,3,-1};
		assertEquals(1, ms.maxSubArray(nums1));
		assertEquals(6, ms.maxSubArray(nums2));
	}
	
	public static TestSuite suite () {
		
		TestSuite suite = new TestSuite();
		suite.addTest(
				new MaximumSubarrayTest("testMaxSubArray"));
		return suite;
	}
	
}
