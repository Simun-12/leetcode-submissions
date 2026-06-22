package binarySearchTree;

import java.util.HashSet;
import java.util.Set;

public class TwoSum4 {
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    private static boolean dfs(TreeNode root, int k, Set<Integer> set) {
        if(root == null) return false;
        if(set.contains(k - root.val))
            return true;
        set.add(root.val);
        return dfs(root.left, k, set) ||
                dfs(root.right, k, set);
    }
    public static boolean findTarget(TreeNode root, int k) {
        return dfs(root, k, new HashSet<>());
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        System.out.println(findTarget(root, 9));
    }
}
