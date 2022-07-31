package com.sanyasee.linkedlist;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value){
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }

    public void delete(int value) {
        Node node = head;

        if(node == null){
            return;
        }

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;

            if (n.value == value){
                node.next = n.next;
                return;
            }
            node = node.next;
        } while (node != head);
    }

    public void display() {
        Node node = head;
        if(node != null){
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while(node != head);
        }
        System.out.println("Head");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
