package com.vincent.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*  ***********TAG: array, backtracking
 * problem: 216. Combination Sum III
 * 
 * Find all possible combinations of k numbers that add up to a number n, 
 * given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

 * Ensure that numbers within the set are sorted in ascending order.

 * Example 1:

 * Input: k = 3, n = 7

 * Output:

 * [[1,2,4]]

 * Example 2:

 * Input: k = 3, n = 9

 * Output:

 * [[1,2,6], [1,3,5], [2,3,4]]
 * 
 */


public class CombinationSumIII {

	/*
	 * @param ret
	 * 		the result
	 * @param target 
	 * 	 add up all possible nums along with path
	 * @param path
	 * 		it is a List, it contains all possible nums
	 * 
	 * @param k
	 * @param n
	 * @param depth
	 * 		from 1 to 9
	 * @return void
	 */
	private void dfs(List<List<Integer>> ret,  ArrayList<Integer> path, int k, int n, int target, int depth) {
		
		/*
		 *  n == target: when sum up all possible numbers equal to n
		 *  path.size() == k : when there is enough nums 
		 */
		if (n == target && path.size() == k) {
			ret.add(new ArrayList<>(path));
			return;
		}
		
		for (int i = depth; i <= 9; i++) {
			if (target + i > n) break; // backtracking
			path.add(i);             //add i
			dfs(ret, path, k, n, target + i, i + 1);
			path.remove(path.size() - 1); // remove i
		}
		
	}
	
	
	public List<List<Integer>> combinationSum3(int k, int n) {
        
		List<List<Integer>> result = new ArrayList<>();
		if (k > n || k == 0) {
			return result;
		}
		
		dfs(result, new ArrayList<>(), k, n, 0, 1);
		return result;
    }
	
}
