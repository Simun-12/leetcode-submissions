package tree.traversal;

import java.util.ArrayList;
import java.util.List;

public class Inorder {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(TreeNode root, List<Integer> ans){
        if(root==null) return;

        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> result = inorderTraversal(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
