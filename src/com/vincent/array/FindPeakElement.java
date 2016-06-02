package com.vincent.array;
/**
 * 162. Find Peak Element https://leetcode.com/problems/find-peak-element/
 * A peak element is an element that is greater than its neighbors.

 * Given an input array where num[i] ¡Ù num[i+1], find a peak element and return its index.

 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

 * You may imagine that num[-1] = num[n] = -¡Þ.

 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

 * Note:
 * Your solution should be in logarithmic complexity.
 * @author vincent
 *
 */
public class FindPeakElement {
	public int findPeakElement(int[] nums) {
	    int n = nums.length;
	    int lo = 0, hi = n - 1;
	    while(lo < hi) {
	        int mid = lo + (hi - lo) / 2;
	        if(nums[mid] < nums[mid+1]) {
	            lo = mid + 1; 
	        } else {
	            hi = mid;
	        }
	    }
	    return lo;
	}
	
	public static void main(String[] args) {
		
		FindPeakElement fpe = new FindPeakElement();
		int [] nums1 = {2,3,4,5,4,5,4,3,2,1,0,1,2,3,2,1,2,3,4,5};
		System.out.println("result:" + fpe.findPeakElement(nums1));
		
	}
	
	
}
