package com.sanyasee.leetcode;

// https://leetcode.com/problems/house-robber/

public class HouseRobber {
    public static void main(String[] args) {

        int[] arr = {2, 1, 1, 2};
        int ans = rob(arr);
        System.out.println(ans);
    }

    static int rob(int[] nums) {

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                evenSum = Math.max(evenSum + nums[i], oddSum);
            } else {
                oddSum = Math.max(evenSum, oddSum + nums[i]);
            }
        }
        return Math.max(evenSum, oddSum);
    }
}
