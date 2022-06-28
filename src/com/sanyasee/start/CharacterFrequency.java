package com.sanyasee.start;

// https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/

import java.util.HashSet;

public class CharacterFrequency {
    public static void main(String[] args) {

    }

    static int minDeletions(String s) {

        int[] charCount = new int[26];

        for (char ch : s.toCharArray()){
            charCount[ch - 'a']++;
        }

        HashSet<Integer> set = new HashSet();

        int deletion = 0;

        for (int value : charCount){
            while(value != 0 && set.contains(value)){
                value--;
                deletion++;
            }
            set.add(value);
        }
        return deletion;
    }
}
