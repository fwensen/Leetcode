package com.vincent.array;
/**
 * 238. Product of Array Except Self
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 * Solve it without division and in O(n).

 * For example, given [1,2,3,4], return [24,12,8,6].

 * Follow up:
 * Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 * 
 * @author vincent
 *
 */
public class ProductofArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		
		int len = nums.length;
		int [] ret = new int[len];
		int multi = nums[0], i;
		for (i = 1; i < len; ret[i] = multi,  multi *= nums[i++]) ;
		for (ret[0] = 1, i = len - 2, multi = nums[len-1]; i >= 0; ret[i] *= multi,  multi *= nums[i--]) ;
		return ret;
	}
}
