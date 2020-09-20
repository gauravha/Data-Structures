package BInaryTree;

import LinkedList.ListNode;

public class BinaryTreeNode<T> {
    public BinaryTreeNode right;
    public BinaryTreeNode left;
    public T val;

    public BinaryTreeNode(T val) {

        this.val = val;
        this.left = null;
        this.right = null;
    }


    public BinaryTreeNode(T val, BinaryTreeNode left,BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
