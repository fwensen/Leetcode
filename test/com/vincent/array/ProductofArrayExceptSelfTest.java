package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ProductofArrayExceptSelfTest extends TestCase{

	ProductofArrayExceptSelf ps;

	public ProductofArrayExceptSelfTest(String m) {
		super(m);
	}
	public void setUp() {
		ps = new ProductofArrayExceptSelf();
	}
	
	public void testProductExceptSelf() {
		
		int [] nums1 = {1,1,1,1,1,1,1,1,1,1};
		int [] ret1 = {1,1,1,1,1,1,1,1,1,1};
		int [] nums2 = {1,2,1,2,1,2,1,2,1};
		int [] ret2 = {16, 8, 16, 8, 16, 8, 16, 8, 16};
		int [] ans1 = ps.productExceptSelf(nums1);
		int [] ans2 = ps.productExceptSelf(nums2);
		for (int i = 0; i < ret1.length; i++) assertEquals(ret1[i], ans1[i]);
		for (int i = 0; i < ret2.length; i++) assertEquals(ret2[i], ans2[i]);
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new ProductofArrayExceptSelfTest("testProductExceptSelf"));
		return suite;
	}
	
}
