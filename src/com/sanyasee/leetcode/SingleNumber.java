package com.sanyasee.leetcode;

// https://leetcode.com/problems/single-number/

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr));
    }


    // In this we will use XOR
    // a ^ 1 = ~a
    // a ^ 0 = a
    // a ^ a = 0
    static int singleNumber(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        int result = 0;
        for(int i : nums){
            result ^= i;
        }
        return result;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
