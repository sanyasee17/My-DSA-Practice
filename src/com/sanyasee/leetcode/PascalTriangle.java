package com.sanyasee.leetcode;

// https://leetcode.com/problems/pascals-triangle/

// https://leetcode.com/problems/pascals-triangle/discuss/2304592/Simple-Java-Solution

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);

        for (List<Integer> row : result){
            System.out.println(row);
        }
    }

    static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prev = new ArrayList<Integer>();

        // Outer loop for no of rows
        for(int i = 1; i <= numRows; i++){
            // Inner loop to get the list in that row

            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j < i; j++){

                // first and last item will always 1
                if(j == 0 || j == i - 1){
                    row.add(1);
                } else {
                    row.add(prev.get(j) + prev.get(j - 1));
                }
            }

            result.add(row);
            prev = row;
        }
        return result;

    }
}


