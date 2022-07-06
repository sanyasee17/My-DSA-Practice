package com.sanyasee.string;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch; // series += ch;

            // Will be creating new objects for every loop
            // like { "a", "ab", "abc", "abcd", ... "abcd....xy"] = Waste of space as nothing pointing to these objects
            // 1 + 2 + 3 + 4 + ... + N = N * (N + 1) / 2 = (N^2 + N) / 2 = O(N^2)

        }
        System.out.println(series);
    }
}
