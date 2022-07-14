package com.sanyasee.leetcode;

// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {

        if(nums.length == 0 || nums.length == 1){
            return nums;
        }

        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = nums[i];
            nums[i] += sum;
            sum += temp;
        }
        return nums;
    }
}
