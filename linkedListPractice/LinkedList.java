package DataStructure.linkedListPractice;

public class LinkedList {

    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
    }

    public void addNodeToEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        // travel till last node then add
        // node.next = null

        Node traverse = head;
        while(traverse.next != null) {
            traverse = traverse.next;
        }

        traverse.next = newNode;

    }

    public void addNodeToFirstEnd(int data) {

        Node newNode =  new Node(data);
        if(head == null) {
            head = newNode;

        }else {

            newNode.next = head;
            head = newNode;
        }


    }

    public void addNodeToNthPosition(int n,int data) {
        int counter = n-1;
        if(isEmpty()) {
            System.out.println("list is empty");
            return;
        }

        if(size() < n ) {
            System.out.println("wrong position");
        }else if( size() == n ) {
            addNodeToEnd(data);
        }else {
            Node traverse = head;
            while(traverse.next != null && counter != 0) {
                counter--;
                traverse = traverse.next;
            }

            Node newNode = new Node(data);
            newNode.next = traverse.next;
            traverse.next = newNode;
        }


    }
    public void removeFirstNode() {

        if(head == null) {
            System.out.println("list is empty");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }else {
            head = head.next;
        }
    }

    public void removeLastNode() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }
        else {

            Node traverse = head;
            while(traverse.next.next != null) {
                traverse = traverse.next;
            }

            traverse.next = null;
        }

    }

    public void removeNodeAtNthPosition(int n ) {
        if(isEmpty()) {
            System.out.println("list is empty");
            return;
        }

        if(size() < n ){
            System.out.println("wrong position");
        }else {

            if(n == 1) {
                removeFirstNode();
                return;
            }


            int count = n-2;
            Node traverse = head;
            while(traverse.next != null && count != 0 ) {
                traverse = traverse.next;
                count--;
            }

            if(traverse.next.next == null)
            {
                traverse.next = null;
            }else {

            traverse.next = traverse.next.next;
            }

        }
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        int count = 0;

        if(head == null) {
            return count;
        }

        Node traverse = head;

        while(traverse != null) {
            count++;
            traverse = traverse.next;
        }

        return count;
    }
    public void printList() {
        Node traverse = head;

        if(head == null) {
            System.out.println("list is empty");
            return;
        }else {

        while(traverse != null) {
            System.out.print(traverse.data + " ");
            traverse = traverse.next;
        }
        }

    }
}


class Node {

    public int data ;
    public Node next;

    public  Node(int data ) {
        this.data = data;
        this.next = null;
    }
}
