package com.vincent.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vincent on 2016/5/14.
 */
public class TestRemoveDuplicatesFromSortedArray {

    @Test
    public void testRemoveDuplicates() {

        //娴嬭瘯鏅�氭儏鍐�
        int [] array1 = {1 ,2,3,4,5,5,5,6,6,6,7,8,9};
        int [] array2 = {1,2,3,4,5,6,7,8,9};
        int len = RemoveDuplicatesFromSortedArray.removeDuplicates(array1);
        for (int i = 0; i < len; i++) {
            Assert.assertTrue(array2[i] == array1[i]);
        }

        //娴嬭瘯鎵�鏈夐兘鏄噸澶嶇殑鎯呭喌
        int [] array3 = new int[10000];
        int [] array4 = {200};
        for (int i = 0; i < 10000; i++) array3[i] = 200;
        len = RemoveDuplicatesFromSortedArray.removeDuplicates(array3);
        for (int i = 0; i < len; i++) Assert.assertTrue(array4[i] == array3[i]);

        //娴嬭瘯鎵�鏈夐兘涓嶆槸閲嶅鐨勬儏鍐�
        int [] array5 = {1,2,3,4,5,6,7,8,9,10};
        int [] array6 = {1,2,3,4,5,6,7,8,9,10};
        len = RemoveDuplicatesFromSortedArray.removeDuplicates(array5);
        for (int i = 0; i < len; i++) Assert.assertTrue(array5[i] == array6[i]);

    }

}
