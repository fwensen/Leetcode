package com.vincent.dp;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ClimbingStairesTest extends TestCase{

	ClimbingStairs cs;
	
	public ClimbingStairesTest(String method) {
		super(method);
	}
	
	public void setUp() {
		cs = new ClimbingStairs();
	}
	
	public void testClimbingStairs() {
		
		assertEquals(1, cs.climbStairs(1));
		assertEquals(2, cs.climbStairs(2));
		assertEquals(3, cs.climbStairs(3));
		assertEquals(5, cs.climbStairs(4));
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new ClimbingStairesTest("testClimbingStairs"));
		return suite;
	}
}
