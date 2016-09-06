package com.vincent.dp;

/**
 * https://leetcode.com/problems/climbing-stairs/
 * 
 * @author vincent
 *	
 *	70. Climbing Stairs
 *	You are climbing a stair case. It takes n steps to reach to the top.
 * 	Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 *
 */

public class ClimbingStairs {

	public int climbStairs(int n) {
        
		if (n <= 2) return n;
		int [] ret = new int[n];
		ret[0] = 1;
		ret[1] = 2;
		for (int i = 2; i < n; i++)
			ret[i] = ret[i-1] + ret[i-2];
		return ret[n-1];
    }
}
