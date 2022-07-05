package com.sanyasee.math.maths;

import java.util.ArrayList;

public class Factors {

    public static void main(String[] args) {
        //factors(20);
        //factors2(20);
        factors3(20);
    }

    // O(N)
    static void factors(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    // O(sqrt(N))
    static void factors2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(i == n/i){
                    System.out.print(i + " "); // for same ex: 36 ==> 6 and 6
                }else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    // but the answers are not in sorted order in factors2() method
    // here both space and time complexity will be O(sqrt(N))
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(i == n/i){
                    System.out.print(i + " "); // for same ex: 36 ==> 6 and 6
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

}