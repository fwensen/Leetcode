package com.vincent.array;

/*
 * 75. Sort Colors
 * 
 * 
 */
public class SortColors {
	/*
	 * @param nums
	 *  
	 */
	public void sortColors(int[] nums) {
        int [] hash = new int[3];
        for (int i = 0; i < nums.length; i++) hash[nums[i]] += 1;
     
        int pointer = 0;
        int red = hash[0], white = hash[1], blue = hash[2];
        for (int i = 0; i < red; i++) nums[pointer++] = 0;
        for (int i = 0; i < white; i++) nums[pointer++] = 1;
        for (int i = 0; i < blue; i++) nums[pointer++] = 2;
    }
	
	/*
	 * a better solution
	 */
	public void sortColors2(int[] nums) {
	    int lt = 0, i = 0, gt = nums.length-1;
	    while(i<=gt){
	        if(nums[i] == 0) {
	            int tmp = nums[i];
	            nums[i] = nums[lt];
	            nums[lt] = tmp;
	            i++;
	            lt++;
	        }
	        else if(nums[i] == 1) i++;
	        else if(nums[i] == 2) {
	            int tmp = nums[i];
	            nums[i] = nums[gt];
	            nums[gt] = tmp;
	            gt--;
	        }
	    }
	
	}
}
