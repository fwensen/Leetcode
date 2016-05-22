package com.vincent.array;

/*
 * 289. Game of Life  Difficulty: Medium
 * 
 * According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

 * Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * Write a function to compute the next state (after one update) of the board given its current state.

 * Follow up: 
 * Could you solve it in-place? Remember that the board needs to be updated at the same time: You cannot update some cells first and then use their updated values to update other cells.
 * In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches the border of the array. How would you address these problems?
 */
public class GameofLife {

	
	final int DIE_TO_DIE = 2;
	final int LIVE_TO_LIVE = 3;
	final int DIE_TO_LIVE = 4;
	final int LIVE_TO_DIE = 5;
	
	final int DIE = 0;
	final int LIVE = 1;
	
	final boolean isAliveBefore(int num) {
		if (num == DIE_TO_DIE || num == DIE_TO_LIVE || num == DIE) return false;
		return true;
	}
	
	final boolean isAliveNow(int n) {
		if (n == DIE_TO_LIVE || n == LIVE_TO_LIVE || n == LIVE) return true;
		return false;
	}
	
	public void gameOfLife(int[][] board) {
     
		int m = board.length; 
		if (m == 0) return;
		int n = board[0].length;
		if (n == 0) return;
		
		int liveCounter;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
			    
			    liveCounter = 0;
				/*
				 * left
				 */
				if (i > 0 && isAliveBefore(board[i-1][j])) liveCounter++;
				/*
				 * top
				 */
				if (j > 0 && isAliveBefore(board[i][j-1])) liveCounter++;
				/*
				 * top left
				 */
				if (i > 0 && j > 0 && isAliveBefore(board[i-1][j-1])) liveCounter++;
				/*
				 * right
				 */
				if (i < m - 1 && isAliveBefore(board[i+1][j])) liveCounter++;
				/*
				 * bottom
				 */
				if (j < n - 1 && isAliveBefore(board[i][j+1])) liveCounter++;
				/*
				 * right bottom
				 */
				if (i < m - 1 && j < n - 1 && isAliveBefore(board[i+1][j+1])) liveCounter++;
				/*
				 * bottom left
				 */
				if (i > 0 && j < n - 1 && isAliveBefore(board[i-1][j+1])) liveCounter++;
				/*
				 * top right
				 */
				if (i < m - 1 && j > 0 && isAliveBefore(board[i+1][j-1])) liveCounter++;
				
				if (isAliveBefore(board[i][j])) {
					if (liveCounter < 2) board[i][j] = LIVE_TO_DIE;
					if (liveCounter == 2 || liveCounter == 3) board[i][j] = LIVE_TO_LIVE;
					if (liveCounter > 3) board[i][j] = LIVE_TO_DIE;
				} else {
					if (liveCounter == 3) board[i][j] = DIE_TO_LIVE;
					else board[i][j] = DIE_TO_DIE;
				}
				
			
			}
		}
		
		/*
		 * check all state
		 */
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				board[i][j] = isAliveNow(board[i][j]) ? LIVE : DIE;
		
    }
	
	public static void main(String [] args) {
		int [][] array = {
				{1,1,0,0,0,1},
				{0,1,1,1,1,1},
				{1,1,1,0,1,0},
				{1,0,0,0,1,0},
				{0,1,1,1,0,1}
		};
		
		GameofLife gf = new GameofLife();
		gf.gameOfLife(array);
		for (int [] a : array) {
			for (int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
	
	
	
}
