package com.sanyasee.searching.linear;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, 22, 45, -40, 365, 70};

        System.out.println(findMin(arr));
    }

    /// assume arr.length != 0
    static int findMin(int[] arr) {

        int min = arr[0];
        for(int item : arr){
            if(item < min){
                min = item;
            }
        }
        return min;
    }
}
