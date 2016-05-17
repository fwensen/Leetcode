package com.vincent.array;

/** TAG: array
 * Created by vincent on 2016/5/9.
 * description: Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n)
 *  to hold additional elements from nums2. The number of elements initialized in nums1
 *  and nums2 are m and n respectively.
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j  = n - 1, k = m + n - 1;
        for (; k >= 0; k--) {

            if (i < 0) nums1[k] = nums2[j--];
            else if (j < 0) nums1[k] = nums1[i--];
            else nums1[k] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];

        }
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,4,5,8,9,10, 0, 0, 0, 0, 0, 0 , 0};
        int [] nums2 = {3, 5, 7, 8, 12, 34, 45};
        MergeSortedArray msa = new MergeSortedArray();
        msa.merge(nums1, 7, nums2, nums2.length);
        for (int i  = 0; i < 14; i++) {
            System.out.println(nums1[i]);
        }
    }
}
