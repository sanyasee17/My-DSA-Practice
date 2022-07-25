package com.sanyasee.leetcode;

// https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        System.out.println(restoreString(str, indices));
    }

    static String restoreString(String s, int[] indices) {

        char[] result = new char[indices.length];

        for(int i = 0; i < s.length(); i++){
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }
}
