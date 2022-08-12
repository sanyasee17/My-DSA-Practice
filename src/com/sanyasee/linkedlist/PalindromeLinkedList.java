package com.sanyasee.linkedlist.questions;

// https://leetcode.com/problems/palindrome-linked-list/

// Google, facebook, Amazon, Apple, LinkedIn, Microsoft

public class PalindromeLinkedList {
    public static void main(String[] args) {


    }

    public boolean isPalindrome(ListNode head) {

        ListNode mid = getMid(head);

        ListNode secondHead = reverse(mid);

        //ListNode reReverseHead = secondHead;

        while(head != null && secondHead != null) {
            if (head.val != secondHead.val){
                return false;
            }
            head = head.next;
            secondHead = secondHead.next;
        }

        //reverse(reReverseHead);
        return true;

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
