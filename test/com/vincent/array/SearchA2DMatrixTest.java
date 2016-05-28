package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * test class for SearchA2DMatrix
 * @author vincent
 *
 */
public class SearchA2DMatrixTest extends TestCase{

	SearchA2DMatrix sam;
	public SearchA2DMatrixTest(String method) {
		super(method);
	}
	
	public void setUp() {
		sam = new SearchA2DMatrix();
	}
	
	public void testSearchMatrix() {
		
		/**
		 * 一个数
		 */
		int [][] matrix1 = {
				{1}
		};
		/**
		 * 一行
		 */
		int [][] matrix2 = {
				{1,3,5,7,9}
		};
		/**
		 * 一列
		 */
		int [][] matrix3 = {
				{1},
				{3},
				{7},
				{10},
				{13},
				{14}
		};
		/**
		 * 正常
		 */
		int [][] matrix4 = {
				{1,3,4,6,7},
				{8,12,13,15,16},
				{19,21,24,26,27},
				{31,33,37,39,40}
		};
		assertEquals(true, sam.searchMatrix(matrix1, 1));
		assertEquals(false, sam.searchMatrix(matrix1, 12));
		
		assertEquals(true, sam.searchMatrix(matrix2, 5));
		assertEquals(false, sam.searchMatrix(matrix2, 6));
		
		assertEquals(true, sam.searchMatrix(matrix3, 10));
		assertEquals(false, sam.searchMatrix(matrix3, 12));
		
		assertEquals(true, sam.searchMatrix(matrix4, 27));
		assertEquals(false, sam.searchMatrix(matrix4, 10));
	}
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new SearchA2DMatrixTest("searchMatrix"));
		return suite;
	}
}
