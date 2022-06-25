package com.sanyasee.searching.binary.assignments;

// https://leetcode.com/problems/kth-missing-positive-number/

public class KthMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11};
        int ans = findKthPositive2(arr, 2);
        System.out.println(ans);
    }


    // Using Binary Search
    static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] - 1 - mid < k)
                start = mid + 1;
            else
                end = mid;
        }
        return start + k;
    }

    // Using Linear Search
    static int findKthPositive2(int[] arr, int k) {
        for(int i : arr){
            if(i <= k) k++; else break;
        }
        return k;
    }

}
