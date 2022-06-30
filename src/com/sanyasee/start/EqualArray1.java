package com.sanyasee.start;

// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
// https://www.youtube.com/watch?v=7ASUzYC2B3Y

public class EqualArray1 {
    public static void main(String[] args) {

    }

    static int minMoves(int[] nums) {

        int sum = 0;
        int min = nums[0];

        for(int n : nums){
            min = Math.min(min, n);
            sum += n;
        }
        return sum - (nums.length) * min;

    }

}
