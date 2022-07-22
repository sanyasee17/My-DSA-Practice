package com.sanyasee.leetcode;

// https://partnergw.elevancehealth.com/logon/LogonPoint/index.html

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class CandySwap {

    public static void main(String[] args) {

        int[] aliceSizes = {1};
        int[] bobSizes = {1, 2};

        int[] ans = fairCandySwap2(aliceSizes, bobSizes);


        System.out.println(Arrays.toString(ans));

    }


    // Using Hashset
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int diff = (IntStream.of(aliceSizes).sum() - IntStream.of(bobSizes).sum()) / 2;

        HashSet<Integer> hashSet = new HashSet<>();

        // Add all values of Alice to set
        for (int num : aliceSizes) hashSet.add(num);

        // Loop through Bob's box to check
        for (int num : bobSizes) {
            if (hashSet.contains(num + diff)) {
                return new int[] {num + diff, num};
            }
        }
        return new int[0];
    }


    // Using Binary Search
    static int[] fairCandySwap2(int[] aliceSizes, int[] bobSizes) {
        int diff = (IntStream.of(aliceSizes).sum() - IntStream.of(bobSizes).sum()) / 2;
        Arrays.sort(aliceSizes);

        for (int num : bobSizes){
            if(binarySearch(aliceSizes, num + diff)){
                return new int[] {num + diff, num};
            }
        }
        return new int[0];
    }





    // Binary Search
    static boolean binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return true;
            }
        }

        return false;
    }

}
