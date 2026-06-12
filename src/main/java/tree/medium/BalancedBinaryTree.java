package tree.medium;

public class BalancedBinaryTree {
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
    private static int helper(TreeNode root){
        if(root == null) return 1;
        int lh = helper(root.left);
        int rh = helper(root.right);
        if(lh == -1 || rh == -1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;
    }
    public static boolean isBalanced(TreeNode root) {
        int ans = helper(root);
        return ans != -1;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(isBalanced(root));
    }
}
