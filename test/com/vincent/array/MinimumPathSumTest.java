package com.vincent.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MinimumPathSumTest extends TestCase{

	private MinimumPathSum mps;

	public MinimumPathSumTest(String method) {
		super(method);
	}
	
	protected void setUp() {
		mps = new MinimumPathSum();
	}
	
	public void testMinPathSum() {
		
		int [][] grid1 = {
				{1,2,3,4,5,6},
				{2,3,4,5,6,7},
				{4,3,2,5,1,3},
				{4,3,1,2,5,6}
		};
		
		int [][] grid2 = {{1}};
		int [][] grid3 = {
				{1,2},
				{1,1}
		};
		assertEquals(25, mps.minPathSum(grid1));
		assertEquals(1, mps.minPathSum(grid2));
		assertEquals(3, mps.minPathSum(grid3));
		
	}
	
	public static TestSuite suite() {
		
		TestSuite suite = new TestSuite();
		suite.addTest(
				new MinimumPathSumTest("testMinPathSum"));
		return suite;
	}
	
}
