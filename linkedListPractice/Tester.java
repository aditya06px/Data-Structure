package DataStructure.linkedListPractice;

import DataStructure.BinaryTree.BinaryTree;
import DataStructure.CircularDoublyLinkedList.CircularDoublyLinkedList;
import DataStructure.DoublyLinkedList.DoublyLinkedList;
import DataStructure.Queue.CircularQueueUsingArray;
import DataStructure.Queue.QueueUsingArray;

public class Tester {

    public static void main(String[] args) {

        BinaryTree t = new BinaryTree();

        t.preOrder();
        System.out.println();
        t.inOrder();
        System.out.println();
        t.postOrder();
    }
}
