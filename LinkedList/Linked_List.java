package DataStructure.LinkedList;
import java.util.LinkedList;

import DataStructure.LinkedList.SinglyLinkedList;

public class Linked_List {
    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();   

         //Add nodes to the list    
         sList.addNodeToTheEnd(1);    
         sList.addNodeToTheEnd(2);    
         sList.addNodeToTheEnd(3);    
         sList.addNodeToTheEnd(4); 
        

         //Displays the nodes present in the list    
        // sList.reverse(sList.head);
        sList.display() ; 
        // System.out.println(sList);  
    }
}
