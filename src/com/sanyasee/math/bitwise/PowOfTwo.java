package com.sanyasee.math.bitwise;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 32; // note: fix for n = 0
        boolean answer = (n & (n - 1)) == 0;
        System.out.println(answer);
    }
}
