package com.sanyasee.start;

import java.util.Arrays;

// https://leetcode.com/problems/kth-largest-element-in-an-array/

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int ans = findKthLargest(arr, k);
        System.out.println(ans);
    }

    static int findKthLargest(int[] nums, int k) {
        if(nums.length == 0){
            return -1;
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
