package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * test class for SearchinRotatedSortedArray
 * @author vincent
 *
 */
public class SearchinRotatedSortedArrayTest extends TestCase{

	SearchinRotatedSortedArray sisa;
	public SearchinRotatedSortedArrayTest(String m) {
		super(m);
	}
	
	public void setUp() {
		sisa = new SearchinRotatedSortedArray();
	}
	
	public void testSearch() {
		int [] nums1 = {6,7,8,9,1,2,3,4,5,6};
		assertEquals(-1, sisa.search(nums1, 0));
		assertEquals(1, sisa.binarySearch(nums1, 7));
		assertEquals(4, sisa.search(nums1, 1));
		assertEquals(9, sisa.search(nums1, 6));
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new SearchinRotatedSortedArrayTest("testSearch"));
		return suite;
	}
}
