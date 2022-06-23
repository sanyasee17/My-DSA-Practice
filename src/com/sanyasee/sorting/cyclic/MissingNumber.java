package com.sanyasee.sorting.cyclic;

// https://leetcode.com/problems/missing-number/
// Amazon Question

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = findMissingNumber(arr);
        System.out.println(ans);
    }

    static int findMissingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }

        // Search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if(index != arr[index]){
                return index;
            }
        }
        // case 2
        return arr.length;
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
