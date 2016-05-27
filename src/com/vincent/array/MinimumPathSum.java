package com.vincent.array;

/**
 * TAG: Array, DP
 * 64. Minimum Path Sum
 * 
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

 * Note: You can only move either down or right at any point in time.
 * 
 */

public class MinimumPathSum {

	public int minPathSum(int[][] grid) {
		
		int m = grid.length;
		int n = grid[0].length;
		//System.out.println("m: "+ m + " n: " + n);
		int [][] minPath = new  int[m][n];
		if (m == n && m == 1) return grid[0][0];
		
		minPath[0][0] = grid[0][0];
		
		for (int i = 1; i < m; i++) minPath[i][0] = (grid[i][0] + minPath[i-1][0]);
		for (int j = 1; j < n; j++) minPath[0][j] = (grid[0][j] + minPath[0][j-1]);
		
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				minPath[i][j] = Math.min(minPath[i-1][j], minPath[i][j-1]) + grid[i][j];
				//System.out.println("grid[i][j]: " + grid[i][j] + "  minPath[i][j]: " + minPath[i][j]);
			}
		}
		return minPath[m-1][n-1];
    }
	
	public static void main(String[] args) {
		
		int [][] grid = {
				{1,2,3,4,5,6},
				{2,3,4,5,6,7},
				{4,3,2,5,1,3},
				{4,3,1,2,5,6}
		};
		
		int [][] grid2 = {{1}};
		int [][] grid3 = {
				{1,2},
				{1,1}
		};
		
		MinimumPathSum mps = new MinimumPathSum();
		int ret = mps.minPathSum(grid);
		System.out.println("ret: "+ret);
	}
}
