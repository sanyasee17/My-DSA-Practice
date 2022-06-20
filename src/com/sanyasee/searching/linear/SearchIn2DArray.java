package com.sanyasee.searching.linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {20, 10, 46, 36},
                {25, 90, -4, 35, 17},
                {54, 89, 76},
                {10, 56, 98, 75}
        };

        int target = 10;
        int[] ans = search(arr, target); // answer will contain {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
