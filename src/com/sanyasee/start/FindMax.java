package com.sanyasee.start;

public class FindMax {
    public static void main(String[] args) {

        int[] arr = {1, 20, 17, 25, 12};

        //System.out.println(findMaxInRange(arr, 1, 2));
    }

    // Imagine array is not empty
    static int findMax(int[] arr) {

        if(arr.length == 0){
            return -1;
        }

        int max = arr[0];
        for(int item : arr){
            if(item > max){
                max = item;
            }
        }
        return max;
    }

    static int findMaxInRange(int[] arr, int start, int end){

        if (end > start){
            return -1;
        }

        if(arr.length == 0){
            return -1;
        }

        int max = arr[0];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
