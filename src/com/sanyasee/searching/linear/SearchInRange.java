package com.sanyasee.searching.linear;

public class SearchInRange {
    public static void main(String[] args) {

        int[] nums = {18, 12, 22, 45, -40, 365, 70};
        int target = 18;
        System.out.println(linearSearch(nums, target, 1, 4));

    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = start; index <=  end; index++) {
            // check for element at every index if it equals to the target
            if(arr[index] == target){
                return index;
            }
        }
        // if no match found
        return -1;
    }
}
