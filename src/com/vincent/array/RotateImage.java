package com.vincent.array;

import java.util.Arrays;

/*
 * 48. Rotate Image, Difficulty: Medium
 * 
 * You are given an n x n 2D matrix representing an image.

 * Rotate the image by 90 degrees (clockwise).
 * Follow up:
 * Could you do this in-place?
 * 
 */
public class RotateImage {

	public void reverse(int [] array) {
		int half = array.length / 2;
		int len = array.length;
		for (int i = 0; i < half; i++) {
			int tmp = array[i];
			array[i] = array[len-1-i];
			array[len-1-i] = tmp;
		}
	}
	
	public void rotateMatrix(int [][] matrx) {
		
		int m = matrx.length, n = matrx[0].length;
		if(m == 1 && n == 1) return;
		for (int i = 0; i < m; i++) {
			for (int j = i+1; j < n; j++) {
				int tmp = matrx[i][j];
				matrx[i][j] = matrx[j][i];
				matrx[j][i] = tmp;
			}
		}
	}
	
	public void rotate(int[][] matrix) {
        
		rotateMatrix(matrix);
		for (int i = 0; i < matrix.length; i++) {
			reverse(matrix[i]);
		}
    }
	
	public static void main(String [] args) {
		int [] a  = {1,2,3,4,5,6,7};
		int [][] matrx = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		RotateImage ri = new RotateImage();
		ri.rotate(matrx);
		for (int i = 0; i < matrx.length; i++) {
			for (Integer j : matrx[i]) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		//ri.reverse(a);
		//System.out.println(Arrays.toString(a));
	}
	
}
