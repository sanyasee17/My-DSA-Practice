package com.sanyasee.leetcode;

// https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        System.out.println(restoreString(str, indices));
    }

    static String restoreString(String s, int[] indices) {

        char[] result = new char[indices.length];

        for(int i = 0; i < s.length(); i++){
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }
    
    // Optimised solution using cyclic sort

    static String restoreStringUsingCyclicSort(String s, int[] arr){

        int i = 0;

        char[] result = s.toCharArray();

        while(i < arr.length){
            int correctIndex = arr[i];
            if(correctIndex != i){
                swapChar(result, i, correctIndex);
                swapIndex(arr, i, correctIndex);
            }else{
                i++;
            }
        }

        return String.valueOf(result);
    }

    static void swapChar(char[] result, int first, int second) {
        char temp = result[first];
        result[first] = result[second];
        result[second] = temp;
    }

    static void swapIndex(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
