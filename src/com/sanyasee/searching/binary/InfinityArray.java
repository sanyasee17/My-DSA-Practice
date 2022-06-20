package com.sanyasee.searching.binary;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfinityArray {

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int ans = findAnswer(arr, target);
        System.out.println(ans);
    }

    static int findAnswer(int[] arr, int target){
        // find the range
        // first start with a box of 2
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            // double the box size
            // end = previousEnd + sizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
