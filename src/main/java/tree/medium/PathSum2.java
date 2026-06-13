package tree.medium;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
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
    private static void helper(TreeNode root, int target, List<List<Integer>> ans, List<Integer>curr, int sum){
        if(root == null) return;
        sum += root.val;
        curr.add(root.val);
        if(root.left == null && root.right == null ){
           if(sum == target) ans.add(new ArrayList<>(curr));
           else {
               curr.remove(curr.size()-1);
               return;
           }
        }
        helper(root.left,target,ans,curr,sum);
        helper(root.right,target,ans,curr,sum);
        curr.remove(curr.size()-1);
    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(root,targetSum,ans,curr,0);
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int target = 3;
        System.out.println(pathSum(root,target));
    }

}
