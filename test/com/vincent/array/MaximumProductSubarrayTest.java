package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MaximumProductSubarrayTest extends TestCase{

	
	MaximumProductSubarray mps;
	public MaximumProductSubarrayTest(String method) {
		super(method);
	}
	
	public void setUp() {
		mps = new MaximumProductSubarray();
	}
	
	public void testMaxProduct() {
		
		int [] nums1 = {-20};
		int [] nums2 = {1,2,3,4,7};
		int [] nums3 = {2,3,4,-4,-5,0};
		int [] nums4 = {-1,-2,-3,-4,-5};
		int [] nums5 = new int[10000];
		for (int i = 0; i < 10000; i++) nums5[i] = -1;
		
		
		assertEquals(-20, mps.maxProduct(nums1));
		assertEquals(168, mps.maxProduct(nums2));
		assertEquals(480, mps.maxProduct(nums3));
		assertEquals(120, mps.maxProduct(nums4));
		assertEquals(1, mps.maxProduct(nums5));
	}
	
	public static TestSuite suite() {
		
		TestSuite suite = new TestSuite();
		suite.addTest(
				new MaximumProductSubarrayTest("testMaxProduct"));
		return suite;
	}
	
	
}
