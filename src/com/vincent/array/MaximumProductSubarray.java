package com.vincent.array;

/*
 * 152. Maximum Product Subarray 
 * 
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 * For example, given the array [2,3,-2,4],
 * the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray {

	public int maxProduct(int[] nums) {
        
		int len = nums.length;
		
		int curMin = nums[0], curMax = nums[0], max = nums[0];
		for (int i = 1; i < len; i++) {
			int cur1 = curMin*nums[i], cur2 = curMax*nums[i];
			curMin = Math.min(nums[i], Math.min(cur1, cur2));
			curMax = Math.max(nums[i], Math.max(cur1, cur2));
			max = Math.max(max, curMax);
		}
			
		return max;
    }

}
