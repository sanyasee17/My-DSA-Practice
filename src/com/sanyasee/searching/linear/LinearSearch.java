package com.sanyasee.searching.linear;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {20, 10, 18, 45, 78, -1, 56, -30, 90, 86};
        int target = 18;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    // Search in the array: return the index if the item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it equals to the target
            if(arr[index] == target){
                return index;
            }
        }
        // if no match found
        return -1;
    }
}
