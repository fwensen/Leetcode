package com.vincent.array;

/**
 * 74. Search a 2D Matrix
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 *
 * Consider the following matrix:
 *
 * [
 *  [1,   3,  5,  7],
 *  [10, 11, 16, 20],
 *  [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 * @author vincent
 *
 */
public class SearchA2DMatrix {
	
	/**
	 * ����˼���ǣ��Ե�һ�н���һ�ζ��ֲ��ң�Ȼ���ٶ���Ӧ���н��ж��ֲ���
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean searchMatrix(int[][] matrix, int target) {
        
		int m = matrix.length;
		if (m == 0) return false;
		int n = matrix[0].length;
		
		int xi = 0, xj = m-1;
		int yi = 0, yj = n-1;
		
		/**
		 * �Ե�һ�н��ж��ֲ��ң��õ��з�Χxi��xj
		 */
		while (xi <= xj) {
			
			int mid = (xi + xj)/2;
			if (matrix[mid][0] < target) {
				xi = mid + 1;
			} else if (matrix[mid][0] > target){
				xj = mid - 1;
			} else {
				return true;
			}
		}
		
		/**
		 * ���ֻ��һ�л�һ�е������ֻ��һ��ʱ������xi
		 */
		if (xi > m - 1) xi -= 1;
		/**
		 * ��xi�н��ж��ֲ���
		 */
		while (yi <= yj && yi <= n-1 && yj >= 0) {
			int mid = (yi + yj)/2;
			if (matrix[xi][mid] < target) {
				yi = mid + 1;
			} else if (matrix[xi][mid] > target) {
				yj = mid - 1;
			} else {
				return true;
			}
		}
		
		/**
		 * û���ҵ�ʱ������false
		 */
		return false;
    }
	
	public static void main(String[] args) {
		
		SearchA2DMatrix sm = new SearchA2DMatrix();
		int [][] matrix = {
				{1,2,4,5},
				{8,12,14,15},
				{21,22,25,27}
		};
		
		int [][] matrix2 = {
			
				{1},
				{3}
		};
		int [][] matrix3 = {
				{1,3}
		};
		boolean ret = sm.searchMatrix(matrix, 1);
		System.out.println("found?: " + ret);
	}
	
}