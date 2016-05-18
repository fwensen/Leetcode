package com.vincent.array;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestUniquePaths extends TestCase{

	public TestUniquePaths(String method) {
		super(method);
	}
	
	public void testUniquePaths() {
		UniquePaths up  = new UniquePaths();
		assertEquals(1, up.uniquePaths(1, 1));
		assertEquals(2, up.uniquePaths(2, 2));
		assertEquals(3, up.uniquePaths(3, 2));
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		
		suite.addTest(
				new TestUniquePaths("testUniquePaths"));
		return suite;
	}
	
}
