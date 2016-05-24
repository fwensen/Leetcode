package com.vincent.array;

/*
 * 53. Maximum Subarray 
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.

 * click to show more practice.

 * More practice:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {

public int maxSubArray(int[] nums) {
     
	int len = nums.length;
	int max = Integer.MIN_VALUE;
	int tmp = 0;
	for (int i = 0; i < len; i++) {
		tmp += nums[i];
		if (tmp > max) max = tmp;
		if (tmp < 0) tmp = 0;
	}
	return max;
    }
}
