package com.vincent.array;

/**
 * 73. Set Matrix Zeroes
 * https://leetcode.com/problems/set-matrix-zeroes/
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 * 
 * Did you use extra space?
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 * @author vincent
 *
 */
public class SetMatrixZeroes {

	/**
	 * 一个聪明的技巧
	 * a better, in place solution, in discuss https://leetcode.com/discuss/86851/java-easy-to-understand-o-1-space-solution-with-2-passes
	 * @param matrix
	 */
	public void setZeroes2(int[][] matrix) {
	    if(matrix==null || matrix.length==0){
	        return;
	    }

	    boolean setFirstRowToZeroes = false;
	    boolean setFirstColumnToZeroes = false;

	    //check if first column needs to be set to zero
	    for(int row=0;row<matrix.length;row++){
	        if(matrix[row][0] == 0){
	            setFirstColumnToZeroes=true;
	            break;
	        }
	    }

	    //check if first row needs to be set to zero
	    for(int col=0;col<matrix[0].length;col++){
	        if(matrix[0][col] == 0){
	            setFirstRowToZeroes=true;
	            break;
	        }
	    }

	    //mark columns and rows to be set to zero
	    for(int row=1;row<matrix.length;row++){
	        for(int col=1;col<matrix[0].length;col++){
	            if(matrix[row][col]==0){
	                matrix[row][0]=0;
	                matrix[0][col]=0;
	            }
	        }
	    }

	    // make rows zero
	    for(int row=1;row<matrix.length;row++){
	        if(matrix[row][0]==0){
	            for(int col=1;col<matrix[0].length;col++){
	                matrix[row][col]=0;
	            }
	        }
	    }

	    // make columns zero
	    for(int col=1;col<matrix[0].length;col++){
	        if(matrix[0][col]==0){
	            for(int row=1;row<matrix.length;row++){
	                matrix[row][col]=0;
	            }
	        }
	    }

	    // zero out first row (if needed)
	    if(setFirstRowToZeroes){
	        for(int col=0;col<matrix[0].length;col++){
	            matrix[0][col]=0;
	        }
	    }

	    // zero out first column (if needed)
	    if(setFirstColumnToZeroes){
	        for(int row=0;row<matrix.length;row++){
	            matrix[row][0]=0;
	        }
	    }
	}
	
	

	public void setRowZero(int [][] matrix, int x) {
		if (x >= matrix.length) return;
		for (int i = 0; i < matrix[0].length; i++) matrix[x][i] = 0;
		
	}

	public void setColumnZero(int [][] matrix, int y) {
		if (matrix[0].length <= y) return;
		for (int j = 0; j < matrix.length; j++) matrix[j][y] = 0;
	}
	/**
	 * 需要O(m + n)额外空间
	 * @param matrix
	 */
	public void setZeroes(int[][] matrix) {
		
		int m = matrix.length; 
		if (m == 0) return;
		int n = matrix[0].length;
		
		boolean [] row = new boolean[m];
		boolean [] column = new boolean[n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		
		for (int i = 0; i < row.length; i++)
			if (row[i]) setRowZero(matrix, i);
		for (int j = 0; j < column.length; j++)
			if (column[j]) setColumnZero(matrix, j);
		
    }
	
	
	public static void main(String[] args) {
		SetMatrixZeroes smz = new SetMatrixZeroes();
		
		int [][] matrix1 = {
				{1,2,3,8,9,2,0},
				{3,4,1,2,3,5,5},
				{5,3,2,0,5,4,2},
				{2,2,3,4,5,6,7},
				{0,2,2,2,2,2,2}
		};
		
		smz.setZeroes(matrix1);
		for (int [] c : matrix1) {
			for (int i : c) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
}
