package com.sanyasee.math.maths;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " : " + isPrime(i));
        }
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        int c = 2;
        while(c * c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
