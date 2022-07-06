package com.sanyasee.string;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 97 + 98 = 195 i.e ASCII(a) + ASCII(b)
        System.out.println("a" + "b"); // ab --> Normal concatenation
        System.out.println('a' + 3); // 97 + 3 = 100 i.e ASCII(a) + 3
        System.out.println((char)('a' + 3)); // d, because 97 + 3 = 100 ==> 100 is the ASCII value od 'd'

        System.out.println("a" + 1); // a1
        // after a few step this will be:  "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Sanyasee" + new ArrayList<Integer>());
        System.out.println("Sanyasee" + new Integer(56));

        // System.out.println(new Integer(56) + new ArrayList<Integer>()); // Error

        /*
        * Plus(+) in java, you can only use with primitives and
        * with all the complex objects as well but the only condition is at least one of  these objects should be of type String
         */
        String ans = new Integer(56) + "" +  new ArrayList<Integer>();
        System.out.println(ans);

        System.out.println("a" + 'b');
    }
}
