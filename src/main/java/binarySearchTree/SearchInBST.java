package binarySearchTree;

import tree.problems.PathSum;

public class SearchInBST {
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static TreeNode searchBST(TreeNode root, int val) {
        while(root!=null){
            if(val == root.val) return root;
            else if(val> root.val)
                root = root.right;
            else root =root.left;
        }
      return null;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        TreeNode ans = searchBST(root, 2);
        System.out.println(ans);
    }
}
