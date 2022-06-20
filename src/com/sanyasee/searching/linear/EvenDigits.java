package com.sanyasee.searching.linear;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(isEvenDigits(num)){
                count++;
            }
        }
        return count;
    }

    // Method to check if the number of digits is even ir not
    static boolean isEvenDigits(int num) {
        if(digits(num) % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    // Method to count no. of digits in a number
    static int digits(int num) {

        if(num < 0 ) {
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }


}
