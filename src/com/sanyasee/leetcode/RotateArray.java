package com.sanyasee.leetcode;

// https://leetcode.com/problems/rotate-array/

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        reverse(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));

        int k = 3;
        System.out.println( 3 % 2);

        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {
        k %= nums.length;

        int len = nums.length;
        reverse(nums, 0, len - 1 - k);
        reverse(nums,len - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    static void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }


}
