package com.sanyasee.math.bitwise;

// https://leetcode.com/problems/flipping-an-image/
// Google


import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] ans = flipAndInvertImage2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int start = 0;
            int end = row.length - 1;
            while(start <= end){
                int temp = row[start] ^ 1;
                row[start] = row[end] ^ 1;
                row[end] = temp;
                start++;
                end--;
            }
        }
        return image;
    }

    static int[][] flipAndInvertImage2(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (row.length + 1 ) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[row.length - 1 - i] ^ 1;
                row[row.length - 1 - i] = temp;
            }
        }
        return image;
    }
}
