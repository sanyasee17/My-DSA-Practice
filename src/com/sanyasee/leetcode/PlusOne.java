package com.sanyasee.leetcode;


// https://leetcode.com/problems/plus-one/

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] plusOne(int[] digits) {
        int n = digits.length;

        for(int i = n - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // if digit is 99 the new digit will be 100, so new array of length + 1
        int[] newDigits = new int[n + 1];

        // and make the 0th digit to 1 so ans will 100 for 99

        newDigits[0] = 1;
        return newDigits;
    }
}
