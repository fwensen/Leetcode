package com.vincent.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vincent
 * 
 * 54. Spiral Matrix
 * 
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

 * For example,
 * Given the following matrix:

 * [
 * 	[ 1, 2, 3 ],
 * 	[ 4, 5, 6 ],
 * 	[ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 *
 */

public class SpiralMatrix {
	/**
	 * 
	 * @param matrix
	 * @return
	 */
	public List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> result = new ArrayList<>();
		int m = matrix.length;
		/**
		 * when matrix is blank, return
		 */
		if (m == 0) return result;
		int n = matrix[0].length;

		
		boolean [][] hash = new boolean[m][n];
		
		/**
		 * @param times 
		 * a roll is left_to_right->top_to_tottom->right_to_left->bottom_to_top
		 * times is total rolls 
		 */
		int times = m < n ? (m+1)/2 : (n + 1)/2;
		int counter = 0;

		/**
		 * @param ix, iy: row
		 * @param jx,jy
		 */
		int ix = 0, iy = m;
		int jx = 0, jy = n;
		while (counter < times) {
		
			/**
			 * left to right
			 */
			for (int k = jx; k < jy; k++) {
				if (!hash[jx][k]) {
					result.add(matrix[jx][k]);
					hash[jx][k] = true;
				}
			}
			/**
			 * top to bottom
			 */
			for (int k = ix + 1; k < iy; k++){ 
				if (!hash[k][jy-1]){
					result.add(matrix[k][jy-1]);
					hash[k][jy-1] = true;
				}
			}
			/**
			 * right to left
			 */
			for (int k = jy - 2; k >= jx; k--) {
				if (!hash[iy-1][k]) {
					result.add(matrix[iy - 1][k]);
					hash[iy-1][k] = true;
				}
			}
			/**
			 * bottom to top
			 */
			for (int k = iy - 2; k > ix; k--) {
				if (!hash[k][jx]) {
					result.add(matrix[k][jx]);
					hash[k][jx] = true;
				}
			}
			ix++;
			iy--;
			jx++;
			jy--;
		
			counter++;
		}
		return result;
    }
	
	public static void main(String[] args) {
		
		int [][] nums = {
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
		SpiralMatrix sm = new SpiralMatrix();
		List<Integer> ret = sm.spiralOrder(nums);
		for (int m : ret) {
			System.out.print(m + " ");
		}
	}
	
}
