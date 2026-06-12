package tree.traversal;
import java.util.ArrayList;
import java.util.List;

public class PreOrder {
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
    public static void preorder(TreeNode root, List<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root,ans);
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> result = preorderTraversal(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
