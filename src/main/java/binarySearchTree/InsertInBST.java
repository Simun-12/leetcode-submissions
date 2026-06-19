package binarySearchTree;

import java.util.*;

public class InsertInBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(val<root.val){
            root.left = insertIntoBST(root.left,val);
        }
        if(val>root.val){
             root.right = insertIntoBST(root.right,val);
        }

    return root;

    }

    public static void main(String[] args) {

        /*
                 8
                / \
               3   10
              / \    \
             1   6    14
        */
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);

    }
}
