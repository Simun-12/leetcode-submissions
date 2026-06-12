package tree.traversal;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right=null;
        }
    }
    public static void postorder(TreeNode root, List<Integer> ans){
        if(root == null) return;

        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.val);
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root,ans);
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> result = postorderTraversal(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
