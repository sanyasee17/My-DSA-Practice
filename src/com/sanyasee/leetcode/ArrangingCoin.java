package com.sanyasee.leetcode;

public class ArrangingCoin {
    public static void main(String[] args) {
        int ans = arrangeCoins(5);
        System.out.println(ans);
    }

    static int arrangeCoins(int n) {

        int i = 1;
        /*
        if (n == 0) {
            return -1;
        }

        while(true){
            if((n - i) < (i + 1)){
                return i;
            } else {
                n -= i;
                i++;
            }
        }
         */

        while(n > 0){
            i++;
            n -= i;
        }

        return i - 1;
    }


    // Using Binary Search
    static int arrangeCoins2(int n) {

        long start = 0;
        long end = n;

        while(start <= end){
            long mid = start + (end - start) / 2;

            long coinsUsed = (mid * (mid + 1)) / 2;

            if(coinsUsed == n){
                return (int)mid;
            }
            if(n < coinsUsed){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return (int)end;
    }


    // Using Math
    static int arrangeCoins3(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }
}
