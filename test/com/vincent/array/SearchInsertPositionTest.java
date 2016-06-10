package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SearchInsertPositionTest extends TestCase{

	SearchInsertPosition sip;
	public SearchInsertPositionTest(String m) {
		super(m);
	}
	
	public void setUp() {
		sip = new SearchInsertPosition();
	}
	
	public void testSearchInsert() {
		int [] nums1 = {1,2,3,4,6};
		int [] nums2 = {1,2,3,4,6,7,8,9};
		int [] nums3 = {1,2,3,4,6,7,8,9,10};
		assertEquals(4, sip.searchInsert(nums1, 5));
		assertEquals(8, sip.searchInsert(nums2, 10));
		assertEquals(4, sip.searchInsert(nums3, 6));
		assertEquals(0, sip.searchInsert(nums1, 0));
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new SearchInsertPositionTest("testSearchInsert"));
		return suite;
	}
}
