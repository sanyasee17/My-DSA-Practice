package com.sanyasee.math.bitwise;

public class SetBits {
    public static void main(String[] args) {

        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        int ans = setBits(n);
        System.out.println(ans);

    }

    static int setBits(int n){

        int count = 0;

        while(n > 0){
            count ++;
            n -= (n & -n);
        }

//        while (n > 0) {
//            count++;
//            n = n & (n - 1);
//        }
        return count;
    }
}
