package com.sanyasee.linkedlist.questions;

// Google, facebook
// https://leetcode.com/problems/reorder-list/

import java.util.List;

public class ReorderList {

    public void reorderList(ListNode head) {

        if(head == null || head.next == null){
            return;
        }

        ListNode mid = getMid(head);

        ListNode secondHead = reverse(mid);
        ListNode firstHead = head;

        // Reorder
        while (firstHead != null && secondHead != null) {

            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;

        }

        // setting next of tail to null
        if(firstHead != null) {
            firstHead.next = null;
        }

    }


    public ListNode reverse(ListNode head) {

        if(head == null ) {
            return head;
        }
        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null) {
            present.next = previous;
            previous = present;
            present = next;
            if(next != null) {
                next = next.next;
            }
        }
        return previous;
    }

    ListNode getMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    private class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
