package com.sanyasee.math.bitwise;

// Amazon Question

public class MagicNumber {
    public static void main(String[] args) {
        int num = 6;
        int base = 5;
        int ans = 0;
        while(num > 0){
            int last = num & 1;
            num = num >> 1;
            ans = ans + last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
