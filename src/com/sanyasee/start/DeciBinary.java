package com.sanyasee.start;

// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

public class DeciBinary {
    public static void main(String[] args) {
        int ans = minPartitions("32");
        System.out.println(ans);
    }

    static int minPartitions(String n) {
        return n.chars().max().getAsInt() - '0';
    }
}
