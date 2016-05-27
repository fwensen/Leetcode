package com.vincent.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author vincent
 *
 * test class for SpiralMatrix
 */
public class SpiralMatrixTest extends TestCase{

	SpiralMatrix sm;
	public SpiralMatrixTest(String method) {
		super(method);
	}
	
	/**
	 * initialize
	 */
	public void setUp() {
		sm = new SpiralMatrix();
	}
	
	/**
	 * test method spiralOrder
	 */
	public void testSpiralOrder() {
		
		int [][] matrix1 = {{}};
		int [][] matrix2 = {
				{1,2,3,4,5,6,7,8}
		};
		int [][] matrix3 = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25},
				{26,27,28,29,30},
				{31,32,33,34,35},
				{36,37,38,39,40},
				{41,42,43,44,45}
				
		};
		int [] aRet3 = {1, 2, 3, 4, 5, 10, 15,
						20, 25, 30, 35, 40, 45,
						44, 43, 42, 41, 36, 31,
						26, 21, 16, 11, 6, 7, 
						8, 9, 14, 19, 24, 29,
						34, 39, 38, 37, 32, 27, 
						22, 17, 12, 13, 18, 23, 28, 33 };
		
		
		List<Integer> ret1 = new ArrayList<>();
		List<Integer> ret2 = new ArrayList<>();
		List<Integer> ret3 = new ArrayList<>();
		for (int n : matrix2[0]) ret2.add(n);
		for (int n : aRet3) ret3.add(n);
		
		assertEquals(ret1, sm.spiralOrder(matrix1));
		assertEquals(ret2, sm.spiralOrder(matrix2));
		assertEquals(ret3, sm.spiralOrder(matrix3));
	}
	
	/**
	 * test suite
	 * @return
	 */
	public static TestSuite suite() {
		
		TestSuite suite = new TestSuite();
		suite.addTest(
				new SpiralMatrixTest("testSpiralOrder"));
		return suite;
	}
}
