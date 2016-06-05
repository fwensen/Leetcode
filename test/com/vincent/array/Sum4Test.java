package com.vincent.array;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * test class for Sum4
 * @author vincent
 *
 */
public class Sum4Test extends TestCase{

	Sum4 s4;
	public Sum4Test(String method) {
		super(method);
	}
	
	public void setUp() {
		s4 = new Sum4();
	}
	
	public void print(List<List<Integer>> ret) {
		for (List<Integer> l : ret) {
			for (int n : l) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
	
	public void testFourSum() {
		
		int [] nums1 = {1, 0, -1, 0, -2, 2};
		List<List<Integer>> ret1 = new ArrayList();
		ret1 = s4.fourSum(nums1, 0);
		print(ret1);
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new Sum4Test("testFourSum"));
		return suite;
	}
}
