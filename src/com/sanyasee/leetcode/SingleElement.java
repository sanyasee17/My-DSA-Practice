package com.sanyasee.leetcode;

// https://leetcode.com/problems/single-element-in-a-sorted-array/
// https://www.youtube.com/watch?v=nMGL2vlyJk0

public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }

    static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        // Boundary Check

        // Case 1 : If array contain only one element
        if(nums.length == 1){
            return nums[0];
        }
        // Case 2 if the start element is the unique element
        if(nums[start] != nums[start + 1]){
            return nums[start];
        }

        // Case 3 if the end element is the unique element
        if(nums[end] != nums[end - 1]){
            return nums[end];
        }


        /**
         * Pair Index Property
         * From the start the duplicates elements start with even(0) and end with odd(1)
         * once the unique element occurs then
         * the way will change to start with odd and end with even
         *
          */


        // Binary Search


        // Case 1 : if mid != mid + 1 and mid != mid - 1
            // found the answer

        // [1, 1, 2, 2, 3, 4, 4]
        //  0  1  2  3  4  5  6
        // Case 2 : if the middle index is odd (here mid = 3)
            // if mid == mid - 1 then the answer will be on the right side
            // else left side



        // [1, 1, 2, 3, 3, 4, 4, 8, 8]
        //  0  1  2  3  4  5  6  7  8
        // Case 3 : if the middle index is even (here mid = 4)
            // if mid == mid - 1 then answer will on the left side
            // else right side

        while(start <= end){

            int mid = start + (end - start) / 2;

            // Case 1
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }

            // Case 2 & 3
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    /*
    static int singleNonDuplicate(int[] nums) {

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--;
            if (nums[mid] != nums[mid+1]) right = mid;
            else left = mid + 2;
        }

        return nums[left];

    }
     */

}
