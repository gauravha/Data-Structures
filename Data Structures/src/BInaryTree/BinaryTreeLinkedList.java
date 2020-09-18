package BInaryTree;

import LinkedList.ListNode;
import Queue.QueueLinearLinkedList;
import com.sun.source.tree.BinaryTree;

import javax.swing.tree.TreeNode;

public class BinaryTreeLinkedList {
    BinaryTreeNode root;

    public  void preOrderTraversals(BinaryTreeNode root){
        if(root == null){
            System.out.println("Empty tree");
        }
        else{
            System.out.println("rootvalue: " + root.val);
            preOrderTraversals(root.left);
            preOrderTraversals(root.right);
        }
    }

    public  static void inOrderTraversals(BinaryTreeNode root){
        if(root == null){
            System.out.println("Empty tree");
        }
        else{
            inOrderTraversals(root.left);
            System.out.println("rootvalue: " + root.val);
            inOrderTraversals(root.right);
        }
    }


    public  static void postOrderTraversals(BinaryTreeNode root){
        if(root == null){
            System.out.println("Empty tree");
        }
        else{
            postOrderTraversals(root.left);
            postOrderTraversals(root.right);
            System.out.println("rootvalue: " + root.val);

        }
    }

    public static void levelOrderTraversals(BinaryTreeNode root){

        if (root == null){
            System.out.println("NO root");
        }
        else{
            QueueLinearLinkedList queueLinearLinkedList = new QueueLinearLinkedList<BinaryTreeNode>();
            queueLinearLinkedList.enqueue(root);
            while(!queueLinearLinkedList.isEmpty()){

                if(root.left!= null){
                    queueLinearLinkedList.enqueue(root.left);
                }
                if(root.right!= null){
                    queueLinearLinkedList.enqueue(root.right);
                }
                BinaryTreeNode nodee = (BinaryTreeNode) queueLinearLinkedList.get(0);
                int val = (int) nodee.val;
                System.out.println(val);
                queueLinearLinkedList.dequeue();
                root = (BinaryTreeNode) queueLinearLinkedList.get(0);
            }
        }
    }



    public static void main(String[] args) {

        BinaryTreeLinkedList tree = new BinaryTreeLinkedList();
        tree.root = new BinaryTreeNode(4);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(5);
        tree.root.left.left = new BinaryTreeNode(1);
        tree.root.left.right = new BinaryTreeNode(3);
        tree.root.right.left = new BinaryTreeNode(6);

        tree.root.right.right = new BinaryTreeNode(7);
        levelOrderTraversals(tree.root);

    }


}
