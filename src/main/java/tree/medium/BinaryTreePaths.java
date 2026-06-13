package tree.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left= null;
            this.right = null;
        }
    }
    private static void helper(TreeNode root, List<String> ans, String curr){
        if(root == null) return;
        if(root.left == null && root.right == null){
            ans.add(curr);
        }
       if(root.left!=null)
        helper(root.left,ans,curr+"->"+root.left.val);
       if(root.right!=null)
           helper(root.right,ans,curr+"->"+root.right.val);
    }
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root,ans,String.valueOf(root.val));
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(binaryTreePaths(root));
    }
}
