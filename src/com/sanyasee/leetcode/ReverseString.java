package com.sanyasee.leetcode;

// https://leetcode.com/problems/reverse-string/

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};

        reverse(chars, 0, chars.length -  1);

        System.out.println(Arrays.toString(chars));

    }

    static void reverse(char[] chars, int start, int end){
        if(start > end){
            return;
        }
        // swap
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;

        reverse(chars, ++start, --end);

    }
}
