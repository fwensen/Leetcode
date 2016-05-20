package com.vincent.array;
/*
 * 59. Spiral Matrix II
 * 
 */
import java.util.Arrays;

public class SpiralMatrixII {

public static int[][] generateMatrix(int n) {
     
	int [][] result = new int[n][n];
	
	int i = 0, j = n, counter = 1;
	
	while (i < j) {
		
		for (int m = i; m < j; m++) result[i][m] = counter++;
		for (int m = i + 1; m < j; m++) result[m][j-1] = counter++;
		for (int m = j-2; m >= i; m--) result[j-1][m] = counter++;
		for (int m = j-2; m > i; m--) result[m][i] = counter++;
		i++;
		j--;
	}
	
	
	return result;
    }
	
	public static void main(String[] args) {
		int [][] ret = SpiralMatrixII.generateMatrix(4);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ret[i][j] + " ");
			}
			System.out.println();
		}
	}
}
