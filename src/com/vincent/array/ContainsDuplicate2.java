package com.vincent.array;

import java.util.*;

/**
 * Created by vincent on 2016/5/14.
 *  Given an array of integers and an integer k,
 *  find out whether there are two distinct indices i and j in the array
 *  such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class ContainsDuplicate2 {

    //perfect solution, from from  https://leetcode.com/discuss/38445/simple-java-solution
    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }

    //Time Limit Exceeded
    public boolean containsNearbyDuplicate2(int[] nums, int k) {

        HashMap<Integer, ArrayList<Integer>> numbers = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.containsKey(nums[i])) {
                ArrayList<Integer> val = new ArrayList<Integer>();
                val.add(i);
                numbers.put(nums[i], val);
            } else {
                ArrayList<Integer> val = numbers.get(nums[i]);
                val.add(i);
            }
        }

        Iterator ite = numbers.entrySet().iterator();
        while (ite.hasNext()) {

            Map.Entry entry = (Map.Entry)ite.next();
            ArrayList<Integer> val = (ArrayList<Integer>)entry.getValue();
            int len = val.size();
            int pre = val.get(0);
            for (int i = 1; i < len; i++) {
                if ((val.get(i) - pre) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

}
