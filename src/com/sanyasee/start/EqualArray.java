package com.sanyasee.start;

// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/

import java.util.Arrays;

public class EqualArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int ans = minMoves2(arr);
        System.out.println(ans);
    }

    static int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        int count = 0;

        while(start < end){
            count += nums[end] - nums[start];
            start++;
            end--;
        }
        return count;
    }
}
