package com.vincent.array;
import java.util.HashSet;
import java.util.Set;

/**
 *  problem: 217. Contains Duplicate
 * Created by vincent on 2016/5/15.
 *
 *  description:
 *      Given an array of integers, find if the array contains any duplicates.
 *          Your function should return true if any value appears at least twice in the array,
 *          and it should return false if every element is distinct.
 *
 */
public class ContainsDuplicate {

    // Runtime: 9ms
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            if (!set.add(num)) return true;
        return false;
    }
}
