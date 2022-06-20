package com.sanyasee.searching.binary.assignments;

// https://leetcode.com/problems/sqrtx/
public class SqaureRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    static int mySqrt(int x) {
        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
