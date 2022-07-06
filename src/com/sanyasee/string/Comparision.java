package com.sanyasee.string;

public class Comparision {
    public static void main(String[] args) {
        String a = "Sanyasee";
        String b = "Sanyasee";
        String c = a;
        // ==
        // System.out.println(a == b); // true
        // System.out.println(c == a); // true

        String name1 = new String("Sanyasee");
        String name2 = new String("Sanyasee");

        // System.out.println(name1 == name2); // false

        System.out.println(name1.equals(name2)); // true
    }
}
