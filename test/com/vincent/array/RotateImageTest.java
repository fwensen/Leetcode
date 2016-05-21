package com.vincent.array;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RotateImageTest extends TestCase{

	RotateImage ri;
	public RotateImageTest(String method) {
		super(method);
	}
	
	public void setUp() {
		ri = new RotateImage();
	}
	
	public void testReverse() {
		
		int [] array1 = {1};
		int [] array2 = {1,2,3,4,5,6};
		int [] array3 = {1,2,3,4,5};
		int [] array4 = {};
		
		int [] ret1 = {1};
		int [] ret2 = {6,5,4,3,2,1};
		int [] ret3 = {5,4,3,2,1};
		int [] ret4 = {};
		
		ri.reverse(array1);
		ri.reverse(array2);
		ri.reverse(array3);
		ri.reverse(array4);
		
		for (int i = 0; i < array1.length; i++) assertEquals(ret1[i], array1[i]);
		for (int i = 0; i < array2.length; i++) assertEquals(ret2[i], array2[i]);
		for (int i = 0; i < array3.length; i++) assertEquals(ret3[i], array3[i]);
		for (int i = 0; i < array4.length; i++) assertEquals(ret4[i], array4[i]);
	}
	
	public void testRotateMatrix() {
		int [][] matrix1 = {{}};
		int [][] matrix2 = {{1}};
		int [][] matrix3 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int [][] ret1 = {{}};
		int [][] ret2 = {{1}};
		int [][] ret3 = {
				{1,4,7},
				{2,5,8},
				{3,6,9}
		};
		ri.rotateMatrix(matrix1);
		ri.rotateMatrix(matrix2);
		ri.rotateMatrix(matrix3);
		
		for (int i = 0; i < matrix2.length; i++)
			for (int j = 0; j < matrix2[0].length; j++)
				assertEquals(matrix2[i][j], ret2[i][j]);
		

		for (int i = 0; i < matrix3.length; i++)
			for (int j = 0; j < matrix3[0].length; j++)
				assertEquals(matrix3[i][j], ret3[i][j]);
	}
	
	public void testRotate() {
		
		int [][] matrix1 = {{1}};
		int [][] matrix2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int [][] ret1 = {{1}};
		int [][] ret2 = {
				{7,4,1},
				{8,5,2},
				{9,6,3}
		};
		
		ri.rotate(matrix1);
		ri.rotate(matrix2);
		
		for (int i = 0; i < matrix1.length; i++)
			for (int j = 0; j < matrix1[0].length; j++)
				assertEquals(matrix1[i][j], ret1[i][j]);
		

		for (int i = 0; i < matrix2.length; i++)
			for (int j = 0; j < matrix2[0].length; j++)
				assertEquals(matrix2[i][j], ret2[i][j]);
	}
	
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(
				new RotateImageTest("testReverse"));
		suite.addTest(
				new RotateImageTest("testRotateMatrix"));
		suite.addTest(
				new RotateImageTest("testRotate"));
		return suite;
	}
	
}
