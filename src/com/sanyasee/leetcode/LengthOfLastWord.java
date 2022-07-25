package com.sanyasee.leetcode;

// https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public static void main(String[] args) {

        String str = "Hello World ";

        System.out.println(lengthOfLastWord(str));
        System.out.println(lengthOfLastWord2(str));
        System.out.println(lengthOfLastWord3(str));
    }

    // Approach 1 : Using split
    static int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        return stringArray[stringArray.length - 1].length();
    }

    // Approach 2 : Using Backward count
    // We will count the characters from back until we found a space
    static int lengthOfLastWord2(String s) {

        int i = s.trim().length() - 1;
        int count = 0;

        while(s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }

    // Approach 3 : Using trim() of String Class
    static int lengthOfLastWord3(String s) {
        return s.trim().length() - s.trim().lastIndexOf(' ') - 1;
    }




}
