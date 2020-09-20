package BST;

import BInaryTree.BInaryTreeArray;
import BInaryTree.BinaryTreeLinkedList;
import BInaryTree.BinaryTreeNode;

public class BST<T> {
     BinaryTreeNode rootNode;

    public  void searchBST(BinaryTreeNode root, int valu ){
        rootNode = root;
        if (root == null){
            System.out.println("Not found in this Tree");
        }
        else if((int)root.val == valu){
            System.out.println("Yes found");
        }
        else if(valu < (int)root.val){
            searchBST(root.left,valu);
        }
        else{
            searchBST(root.right,valu);
        }
    }

    public void insertNOdeInBst(BinaryTreeNode root, int value){
        rootNode = root;
        BinaryTreeNode nodeTOInsert = new BinaryTreeNode(value);
        if(root == null) {
             rootNode = nodeTOInsert;
             System.out.println("Value inserted");

        }

        else if((int)root.val == value){
            System.out.println("Value is already there in the tree");
        }
        else if(value < (int)root.val){
            insertNOdeInBst(root.left,value);
        }
        else{
            insertNOdeInBst(root.right,value);
        }
    }


    public void deleteNode(BinaryTreeNode root, int value){
        rootNode = root;
        if(root == null) {
//            rootNode = nodeTOInsert;
            System.out.println("No value to Delete");


        }
        else if((int)root.val == value){
            System.out.println("Value is already there in the tree");
        }
        else if(value < (int)root.val){
            deleteNode(root.left,value);
        }
        else{
            deleteNode(root.right,value);
        }
    }

    public static void main(String[] args) {
//        BinaryTreeLinkedList tree = new BinaryTreeLinkedList();
//        BST bst = new BST();
//        root.left = new BinaryTreeNode(2);
//        root.right = new BinaryTreeNode(5);
//        root.left.left = new BinaryTreeNode(1);
//        root.left.right = new BinaryTreeNode(3);
//        root.right.left = new BinaryTreeNode(6);
//        root.right.right = new BinaryTreeNode(7);
        BST bst_tree = new BST();
        bst_tree.insertNOdeInBst(bst_tree.rootNode,89);
        bst_tree.insertNOdeInBst(bst_tree.rootNode,90);
        bst_tree.insertNOdeInBst(bst_tree.rootNode,  91);
        bst_tree.insertNOdeInBst(bst_tree.rootNode,92);
        bst_tree.insertNOdeInBst(bst_tree.rootNode,93);
        bst_tree.insertNOdeInBst(bst_tree.rootNode,  94);


//        insertTreeNode(555);
//        insertTreeNode(23);

        bst_tree.searchBST(bst_tree.rootNode,4);
    }



}
