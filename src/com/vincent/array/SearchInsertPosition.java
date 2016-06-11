package com.vincent.array;
/**
 * 
 * 35. Search Insert Position https://leetcode.com/problems/search-insert-position/
 * 
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 * You may assume no duplicates in the array.

 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 * 
 * 
 */
public class SearchInsertPosition {
	
	/**
	 * 其实只需这样即可
	 * @param A
	 * @param target
	 * @return
	 */
	public int searchInsert1(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
	
	/**
	 * 二分查找,我的实现
	 * @param nums
	 * @param target
	 * @return
	 */
	int binarySearch(int[] nums, int target) {
		
		int s = 0, e = nums.length;
		while (s < e) {
			int mid = (s+e)/2;
			if (nums[mid] == target) return mid;
			else if (nums[mid] < target) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		
		if (s < nums.length && nums[s] < target) return s + 1;
		else return s;
		
	}
	
	public int searchInsert(int[] nums, int target) {
    
		int len = nums.length;
		if (len == 0 || nums[0] > target) return 0;
		
		return binarySearch(nums, target);
    }
	
}
