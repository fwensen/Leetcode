package com.vincent.array;
/**
 * 33. Search in Rotated Sorted Array  https://leetcode.com/problems/search-in-rotated-sorted-array/
 * 
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 * You are given a target value to search. If found in the array return its index, otherwise return -1.

 * You may assume no duplicate exists in the array.
 * 
 * @author vincent
 *
 */
public class SearchinRotatedSortedArray {

	public int binarySearch(int [] nums, int target) {
		
		int len = nums.length;
		if (len == 0) return -1;
		int s = 0, e = len - 1;
		while (s < e) {
			int mid = (s + e)/2;
			if (nums[mid] >= nums[s]) {
				
				if (nums[mid] >= target && target >= nums[s]) {
					e = mid;
				}
				else  {
					s = mid + 1;
				}
			} else {
				
				if (nums[mid] < target && target <= nums[e]) {
					s = mid + 1;
				}
				else {
					e = mid;
				}
			}
		}
		return nums[s] == target ? s : -1;
	}
	
	
	public int search(int[] nums, int target) {
		return binarySearch(nums, target);
    }
	
	public static void main(String[] args) {
		SearchinRotatedSortedArray sr = new SearchinRotatedSortedArray();
		int [] nums1 = {1,3,1,1,1};
		System.out.println("ret: " + sr.search(nums1, 3));
	}
	
}
