package com.sanyasee.linkedlist.questions;

// https://leetcode.com/problems/happy-number/
// Google

public class HappyNumber {

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

         do {
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
         } while (fast != slow);

        return slow == 1;

    }

    public int findSquareSum(int num) {
        int ans = 0;
        while ( num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }

}
