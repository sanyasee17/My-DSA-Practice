package com.sanyasee.linkedlist.questions;

// https://leetcode.com/problems/linked-list-cycle/

// https://leetcode.com/problems/linked-list-cycle-ii/

import java.util.List;

public class LinkedListCycle {



    // Fast & Slow Pointer Method
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Find Length of cycle
    public int lengthOfCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {

        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                length = lengthOfCycle(slow);
                break;
            }
        }
        // if no cycle present return null
        if(length == 0) {
            return null;
        }

        // find the start
        ListNode f = head;
        ListNode s = head;

        while(length > 0) {
            s = s.next;
            length--;
        }

        // Keep moving both forward, and they will meet at cycle start
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }


    // https://leetcode.com/problems/middle-of-the-linked-list/

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
        val = x;
        next = null;
    }
 }
}
