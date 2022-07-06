package com.sanyasee.string;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274f;

        // % -> placeholder
        // . -> decimal
        // 2 -> up to 2 digits (also rounds up)
        // f -> for float type
        // printf -. for formatted print
        // System.out.printf("Formatted number is %.2f", a);


        // System.out.println(Math.PI);
        // System.out.printf("Pie: %.3f", Math.PI);

        System.out.printf("Hello, my name is %s and I am %s", "Sanyasee", "Cool");
    }
}
