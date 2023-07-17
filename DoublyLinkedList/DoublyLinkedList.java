package DataStructure.DoublyLinkedList;

class Node {
    int data ;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    Node head;
    Node tail;

    public void addNodeTotheFront(int data) {

        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addNodeToTheEnd(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

   public void addNodeInSortedManner(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }else {
            Node traverse = head;

            while(traverse != null && traverse.data < newNode.data) {
                traverse = traverse.next;
            }

            if(traverse == head) {
                //add node to first
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            else if(traverse == null) {
                // add node to last
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }

            else {
                 // add in middle
                newNode.next = traverse;
                newNode.prev = traverse.prev;
                traverse.prev.next = newNode;
                traverse.prev = newNode;
            }
        }
   }

   public void displayReverse() {
        if (tail == null) {
            System.out.println("list is empty");
            return;
        }

        Node current = tail;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
   }
   public  void display() {
        if(head == null) {
            System.out.println("list is empty");
        }
        else {
            Node traverse = head;

            while(traverse != null ){
                System.out.print(traverse.data + " ");
                traverse = traverse.next;
            }
        }

    }
}
