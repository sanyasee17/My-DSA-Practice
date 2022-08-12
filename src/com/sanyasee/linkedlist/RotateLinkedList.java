package com.sanyasee.linkedlist.questions;

// Google, Facebook, Twitter
// https://leetcode.com/problems/rotate-list/


public class RotateLinkedList {


    public ListNode rotateRight(ListNode head, int k) {

        if(k < 1 || head == null || head.next == null) {
            return head;
        }

        ListNode tail = head;
        int length = 0;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        tail.next = head;

        ListNode dummyHead = head;

        for (int i = 0; i < k % length; i++) {
            dummyHead = dummyHead.next;
        }
        head = dummyHead.next;
        dummyHead.next = null;

        return head;
    }

    public class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
