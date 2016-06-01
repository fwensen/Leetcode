package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RemoveDuplicatesfromSortedArrayIITest extends TestCase{

	RemoveDuplicatesfromSortedArrayII rd;
	public RemoveDuplicatesfromSortedArrayIITest(String method) {
		super(method);
	}
	
	public void setUp() {
		rd = new RemoveDuplicatesfromSortedArrayII();
	}
	
	public void testRemoveDuplicates() {
		
		int [] nums1 = {1,1,2,2,3,3,3,4,4,4,5,6,6};
		int [] ret1 = {1,1,2,2,3,3,4,4,5,6,6,7};
		
		int [] nums2 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int [] ret2 = {1,1,1,1,1,1};
		
		int len1 = rd.removeDuplicates(nums1);
		for (int i = 0; i < len1; i++) 
			assertEquals(ret1[i], nums1[i]);
		
		int len2 = rd.removeDuplicates(nums2);
		for (int i = 0; i < len2; i++) assertEquals(ret2[i], nums2[i]);
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new RemoveDuplicatesfromSortedArrayIITest("testRemoveDuplicates"));
		return suite;
	}
	
}
