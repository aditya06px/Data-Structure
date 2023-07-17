package DataStructure.LinkedList;


// class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//             this.data = data;
//             this.next = null;
//     }
// }

// public class SinglyLinkedList {
    
   

//     //Represent the head and tail of the singly linked list
//     public Node head = null;
//     public Node tail = null;

//     //addNode() will add a new node to the list  
//     public void addNode(int data) {

//         //Create a new node  
//         Node newNode = new Node(data);

//         //Checks if the list is empty
//         if(head == null) {
//             head = newNode;
//             tail = newNode;
//         }
//         else {
//              //newNode will be added after tail such that tail's next will point to newNode    
//              tail.next = newNode;
//              tail = newNode;
//         }
//     }


//     //display() will display all the nodes present in the list    

//     public void display() {

//         //Node current will point to head    
//         Node current = head;

//         if(head == null) {
//             System.out.println("List is Empty");
//             return;
//         }
//         else {

//             while(current != null){
//                 System.out.println(current.data+ " ");   
//                 current = current.next;
//             }
//             System.out.println();    
//         }
//     }
// }


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }    
}

public class SinglyLinkedList {

    public Node head;
    public Node tail;

    public void addNodeToTheEnd(int data) {

           Node newNode = new Node(data);

           if(head == null) {
            head = newNode;
            tail = newNode;
           }
           else {
            tail.next = newNode;
            tail = newNode;
           }
    }

    public void addNodeToFirst (int data) {

        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

         newNode.next = head;
         head = newNode;
    }

    public void removeLastNode() {
              if(head == null) {
                System.out.println("List is already Empty");
                return;
              }
              else if(head.next == null) {
                head = null;
              }
              else {
                System.out.println("helllo");
                Node current = head;

                while(current.next.next != null) {
                      current = current.next;
                }
               current.next = null;
                tail = current;
              }
    }

    public void removeFirstNode() {
        if(head == null) {
            return; 
        }
        else if(head.next == null) {
            head = null;
            return;
        }
        else {
             head = head.next;
        }
    }
    public void display() {

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            Node current = head;

            while(current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public void reverse (Node current) {
        if(head == null) {
            System.out.println("List is Empty");
        }
        else {

            if(current.next == null) {
                System.out.print(current.data+" ");
                return;
            }

            reverse(current.next);
            System.out.print(current.data + " ");  

        }
    }  

   public int size() {
            
    if(head == null) {
        return 0;
    }
    else {
        if(head.next == null) {
            return 1;
        }

        Node current = head;
        int count = 1;
        while(current.next != null) {
              count++;
              current = current.next;
        }

        return count;
    }
   }
}