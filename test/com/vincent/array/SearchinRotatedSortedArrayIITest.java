package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SearchinRotatedSortedArrayIITest extends TestCase{

	SearchinRotatedSortedArrayII sr = new SearchinRotatedSortedArrayII();
	public SearchinRotatedSortedArrayIITest(String method) {
		super(method);
	}
	
	public void testSearch() {
		
		int [] nums1 = {6,6,7,8,9,9,2,3,3,3,4,5};
		int [] nums2 = {1,3,1,1,1,1};
		assertTrue(sr.search(nums1, 9));
		assertTrue(sr.search(nums2, 3));
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new SearchinRotatedSortedArrayIITest("testSearch"));
		return suite;
	}
}
