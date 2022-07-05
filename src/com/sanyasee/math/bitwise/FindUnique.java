package com.sanyasee.math.bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(findAns(arr));
    }


    private static int findAns(int[] arr) {

        int unique = 0;
        for(int num : arr){
            unique ^= num;
        }
        return unique;
    }

    // a ^ 1 = ~a
    // a ^ 0 = a
    // a ^ a = 0
}
