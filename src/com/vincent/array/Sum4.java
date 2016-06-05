package com.vincent.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 4Sum https://leetcode.com/problems/4sum/
 * 
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

 * Note: The solution set must not contain duplicate quadruplets.

 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

 * A solution set is:
 * [
 *  [-1,  0, 0, 1],
 *  [-2, -1, 1, 2],
 *  [-2,  0, 0, 2]
 * ]
 * 
 * @author vincent
 *
 */
public class Sum4 {

	public List<List<Integer>> fourSum(int[] nums, int target) {
        
		 List<List<Integer>> result = new ArrayList();
		 ArrayList<Integer> l;
		 Arrays.sort(nums);
		 int len = nums.length;
		 
		 for (int i = 0; i < len - 3; i++) {
			 
			 if(i != 0 && nums[i] == nums[i-1]) continue; //出现重复时
			 if(nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;//当后面的数和大于target，说明已经不再有了
			 if(nums[i] + nums[len-1] + nums[len-2] + nums[len-2] < target) continue;
			 
			 for (int j = i + 1; j < len -2; j++) {
				if(j != i+1 && nums[j] == nums[j-1]) continue; //出现重复时
			 	if(nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) break;
			 	if(nums[i] + nums[j] + nums[len-1] + nums[len-2] < target) continue;
			 	int s = j + 1, e = len - 1;
			 	while (s < e) {
			 		int tmp = nums[i] + nums[j] + nums[s] + nums[e];
			 		if (tmp == target) {
			 			l = new ArrayList();
			 			l.add(nums[i]);
			 			l.add(nums[j]);
			 			l.add(nums[s]);
			 			l.add(nums[e]);
			 			result.add(l);
			 			s++;
			 			while (s < len && nums[s] == nums[s-1])
			 				s++;
			 		} else if (tmp > target) {
			 			e--;
			 		} else {
			 			s++;
			 		}
			 	}
			 }
		 }
		 return result;
	}
	 
}
