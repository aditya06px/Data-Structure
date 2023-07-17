package DataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private BTNode root;

    public BinaryTree() {
        createTree();
    }

    private void createTree() {

        BTNode n1 = new BTNode(40);
        BTNode n2 = new BTNode(30);
        BTNode n3 = new BTNode(50);
        BTNode n4 = new BTNode(20);
        BTNode n5 = new BTNode(35);
        BTNode n6 = new BTNode(45);
        BTNode n7 = new BTNode(70);
        BTNode n8 = new BTNode(15);
        BTNode n9 = new BTNode(49);

        n2.left = n4;
        n2.right = n5;

        n4.left = n8;

        n3.left = n6;
        n3.right = n7;

        n6.right = n9;

        n1.left = n2;
        n1.right = n3;

        root = n1;
    }

    // in binary tree
    public void insertNode(int data) {
        BTNode newNode = new BTNode(data);

        if(root == null) {
            root = newNode;
            return;
        }

        BTNode parent = null;
        BTNode current = root;

        while(current != null) {
            parent = current;

            if(current.data < data) {
                current = current.right;
            }else if(current.data > data) {
                current = current.left;
            }else {
                System.out.println("node already exists ");
                return;
            }
        }

        if( data > parent.data) {
            System.out.println("added to right part of node");
            parent.right = newNode;
        }else {
            System.out.println("added to left part of node");
            parent.left = newNode;
        }

    }

    public int countNode() {
        return countNodes(root);
    }

    private int countNodes(BTNode root) {

        if(root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int countLeafNode() {
        return countLeafNode(root);
    }

    private int countLeafNode(BTNode root) {

         if(root == null){
             return 0;
         }

         if(root.left == null && root.right == null) {
             return 1;
         }
        int count = countLeafNode(root.left) + countLeafNode(root.right);
        return count;
    }
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(BTNode root) {

        //break condition
        if(root == null) {
            return;
        }

        //process the node
        System.out.print(root.data + " -> ");

        //process left node
        if(root.left != null) {
            preOrder(root.left);
        }

        //process right node
        if(root.right != null) {
            preOrder(root.right);
        }
    }


    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(BTNode root) {

        //break condition
        if(root == null) {
            return;
        }
        //process left node
        if(root.left != null) {
            inOrder(root.left);
        }

        //process the node
        System.out.print(root.data + " -> ");


        //process right node
        if(root.right != null) {
            inOrder(root.right);
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(BTNode root) {

        //break condition
        if(root == null) {
            return;
        }


        //process left node
        if(root.left != null) {
            postOrder(root.left);
        }

        //process right node
        if(root.right != null) {
            postOrder(root.right);
        }

        //process the node
        System.out.print(root.data + " -> " );
    }

    
    public boolean binarySearch(int data) {

        BTNode current = root;

        while (current != null) {

            if(current.data < data ) { //10 < 100
                // find in right subtree
                current = current.right;
            }else if(current.data > data) {
                current = current.left;
            }else {
                return true;
            }
        }

        return false;
    }

    public void bredthFirstSerach() {
        bredthFirstSearch(root);
    }

    private void bredthFirstSearch(BTNode root) {
        Queue<BTNode> queue = new LinkedList<>();
         
        if(root == null) return;
        
        queue.add(root);
        
        while(!queue.isEmpty()) {


            BTNode node = queue.poll();

            System.out.print(node.data + " ->  ");
            
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right); 
        }
    }
}
