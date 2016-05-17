package com.vincent.array;

/**
 * Created by vincent on 2016/5/11.
 *
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * 
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 */
public class PlusOne {

   public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        int flag = 1;
        for (int i = len - 1; i >= 0; i--) {
            
            int rt = digits[i] + flag;
            flag = rt / 10;
            digits[i] = rt % 10;
        }
        
        if (flag == 1) {
            
            int [] array = new int[len + 1];
            array[0] = 1;
            for (int i = 0; i < len; i++) {
                array[i + 1] = digits[i];
            }
            return array;
        } else {
            return digits;
        }
       
    }

}
