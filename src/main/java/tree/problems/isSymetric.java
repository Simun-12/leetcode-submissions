package tree.problems;

import java.util.LinkedList;
import java.util.Queue;

public class isSymetric {
    private static class TreeNode{
        int val;
        TreeNode left ;
        TreeNode right;
         TreeNode(int val){
             this.val = val ;
             this.left = null;
             this.right = null;
         }
    }
    private static boolean helper(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return helper(left.left, right.right)
                && helper(left.right, right.left);
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
}
