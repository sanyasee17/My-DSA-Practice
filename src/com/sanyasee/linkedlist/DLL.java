package com.sanyasee.linkedlist;

public class DLL {

    private Node head;


    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node(value);
        newNode.next = null;
        Node last = head;

        if (head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;

    }

    public void display() {
        Node node = head;
        Node last = null;
        while(node != null) {
            last = node;
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last= last.prev;
        }
        System.out.println("Start");

    }

    public void insert(int after, int value){
        Node p = find(after);

        if (p == null) {
            System.out.println("Does not exists");
            return;
        }

        Node newNode = new Node(value);

        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, Node prev) {
            this.next = next;
            this.prev = prev;
        }
    }
}
