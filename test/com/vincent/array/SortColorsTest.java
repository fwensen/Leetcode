package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SortColorsTest extends TestCase {

	SortColors sc;
	public SortColorsTest(String method) {
		super(method);
	}
	
	public void setUp() {
		sc = new SortColors();
	}
	
	public void testSortColors() {
		
		int [] colors1 = {0,1,2};
		int [] colors2 = {2,1,0};
		int [] colors3 = {1,2,2,2,2,1,1,1,1,0,0,0,0,1};
		int [] colors4 = {2};
		int [] ret1 = {0,1,2};
		int [] ret2 = {0,1,2};
		int [] ret3 = {0,0,0,0,1,1,1,1,1,1,2,2,2,2};
		int [] ret4 = {2};
		
		sc.sortColors(colors1);
		sc.sortColors(colors2);
		sc.sortColors(colors3);
		sc.sortColors(colors4);
		
		for (int i = 0; i < colors1.length; i++) assertEquals(ret1[i], colors1[i]);
		for (int i = 0; i < colors2.length; i++) assertEquals(ret2[i], colors2[i]);
		for (int i = 0; i < colors3.length; i++) assertEquals(ret3[i], colors3[i]);
		for (int i = 0; i < colors4.length; i++) assertEquals(ret4[i], colors4[i]);
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new SortColorsTest("testSortColors"));
		return suite;
	}
	
}
