package com.vincent.array;
/**
 * 80. Remove Duplicates from Sorted Array II  https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?

 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],

 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 * 
 * @author vincent
 *
 */
public class RemoveDuplicatesfromSortedArrayII {

	public int removeDuplicates(int[] nums) {
    
		int l = nums.length; 
		if (l == 0) return 0;
		
		int len = l;
		for (int j = 1,i = 0; j < l; j++) {
			
			if (nums[i] < nums[j]) {
				i++;
				nums[i] = nums[j];
			} else if (nums[i] == nums[j]) {
				i++;
				nums[i] = nums[j];
				while (j + 1 < l && nums[1+j] == nums[i]) {
					len--;
					j++;
				}
			}
		}
		
		return len;
    }
	
	public static void main(String[] args) {
		
		RemoveDuplicatesfromSortedArrayII rd = new RemoveDuplicatesfromSortedArrayII();
		int [] nums1 = {1,1,1,2,2,3,4,4,4,5,6,7,7,7,8,8};
		System.out.println(rd.removeDuplicates(nums1));
		for (int n : nums1) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
