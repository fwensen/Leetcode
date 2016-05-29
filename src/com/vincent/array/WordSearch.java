package com.vincent.array;
/**
 * 79. Word Search
 * Given a 2D board and a word, find if the word exists in the grid.
 *
 * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 *
 * For example,
 * Given board =
 *
 *	[
 * 		['A','B','C','E'],
 * 		['S','F','C','S'],
 * 		['A','D','E','E']
 * 	]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 * 
 * @author vincent
 *
 */
public class WordSearch {
	/**
	 * 使用深度优先遍历
	 * @param board 
	 * @param visited 是否已经遍历过
	 * @param word 需遍历的词
	 * @param n 已经成功匹配了n个char
	 * @param x 现在从x行开始
	 * @param y 现在从y列开始
	 * @return
	 */
	
	boolean helper(char[][] board, boolean [][] visited, String word, int n, int x, int y) {
		
		if (word.charAt(n) == board[x][y]) {
		
			/**
			 * 设置已访问标志
			 */
			visited[x][y] = true;
			
			if (n == word.length() - 1) return true;
			/**
			 * 遍历左边的char
			 */
			if (x - 1 >= 0 && !visited[x-1][y])
				if (helper(board, visited, word, n+1, x-1, y)) return true;
			
			/**
			 * 遍历右边的char
			 */
			if (x + 1 < visited.length && !visited[x+1][y])
				if (helper(board, visited, word, n+1, x+1, y)) return true;
			/**
			 * 往上遍历
			 */
			if (y-1 >= 0 && !visited[x][y-1])
				if (helper(board, visited, word, n+1, x, y-1)) return true;
			/**
			 * 往下遍历
			 */
			if (y + 1 < board[0].length && !visited[x][y + 1])
				if (helper(board, visited, word, n+1, x, y + 1)) return true;
			/**
			 * 恢复标志位
			 */
			visited[x][y] = false;
		}
		return false;
	}
	
	public boolean exist(char[][] board, String word) {
        
		if (word == null) return false;
		int m = board.length; if (m == 0) return false;
		int n = board[0].length;
		
		boolean [][] path = new boolean[m][n];
		
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (helper(board, path, word, 0, i, j)) return true;
			}
		return false;
    }
	
	public static void main(String[] args) {
		
		char [][] board = {
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
		};
		WordSearch ws = new WordSearch();
		
		boolean ret = ws.exist(board, "ABCESFS");
		if (ret)
			System.out.println("find!");
		else
			System.out.println("not!");
	}
	
}
