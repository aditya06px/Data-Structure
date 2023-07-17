package DataStructure.BinaryTree;

public class BinaryTreeTester {
    public static void main(String[] args) {
        
        BinaryTree t = new BinaryTree();

        // inorder traversal
//        t.inOrder();
//        System.out.println();


        //add new nodes
        t.insertNode(60);
        t.insertNode(100);
         t.insertNode(105);
        t.insertNode(10);
        t.insertNode(15);
        t.insertNode(120);
        t.insertNode(99);

        t.inOrder();
        t.bredthFirstSerach();
        // no of nodes
        //System.out.println("no of node are -> " + t.countNode());

        // no of leaf nodes
       // System.out.println("no of leaf nodes " + t.countLeafNode());

        //System.out.println(" node is present or not -> " + t.binarySearch(999));

    }
}
