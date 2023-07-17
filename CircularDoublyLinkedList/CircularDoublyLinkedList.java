package DataStructure.CircularDoublyLinkedList;

import DataStructure.Queue.CircularQueueUsingArray;

public class CircularDoublyLinkedList {

    private Node head;
    private Node tail;

    public CircularDoublyLinkedList() {
        Node newNode = new Node();
        head = newNode;
        head.next = head;
        head.prev = head;
        tail = newNode;
        tail.next = tail;
        tail.prev = tail;
    }


    public void addNodeToTheLast(int data) {

           Node newNode = new Node(data);

           newNode.prev = tail;
           newNode.next = head;
           tail.next = newNode;
           head.prev = newNode;
           tail = newNode;
    }

    public void addNodeTFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;

    }

    public void addNodeInSortedOrder(int data) {

        Node newNode = new Node(data);
        Node current  = head.next;

        while(current != head && current.data < data) {
            current = current.next;
        }

        if(current == head) {
            // add to the last
            newNode.next  = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }

        else if(current == head.next) {
            // add to the first
            newNode.next = head.next;
            newNode.prev = head;
            head.next.prev = newNode;
            head.next = newNode;
        }
        else {
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;

        }


    }

    public void remove(int data) {

        Node current = head.next;
        while (current != head) {

            if(current.data == data) {

                current.prev.next = current.next;
                current.next.prev = current.prev;
                break;
            }
            current = current.next;
        }
    }
    public  void display() {

        Node current = head.next;

        while(current != head) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }


    private class Node{


        private int data;
        private  Node next;
        private Node prev;

        public  Node(int data) {
            this.data = data;
        }

        public  Node() {

        }
    }


}
