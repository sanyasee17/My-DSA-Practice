package com.sanyasee.searching.binary;

// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArray {
    public static void main(String[] args) {

    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end =  0;
        for (int num : nums){
            start = Math.max(start, num); // in the end of the loop, this will contain the max item from the array
            end += num;
        }

        // Binary Search
        while (start < end){
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // you cannot add this in this sub-array, make new one
                    // say you add this num in new sub-array, then sum = num
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }else {
                end = mid;
            }

        }

        return end; // here start == end
    }
}
