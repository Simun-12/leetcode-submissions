package tree.medium;

public class MaxPathSum {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            TreeNode left = null;
            TreeNode right = null;
        }
    }
    static int max=Integer.MIN_VALUE;
    private static int helper(TreeNode root){
        if(root == null) return 0;
        int lh = Math.max(0,helper(root.left));
        int rh = Math.max(0,helper(root.right));
        max = Math.max(max,lh+rh+root.val);
        return  Math.max(lh,rh) + root.val;

    }
    public static int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        max =  helper(root);
        return max;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(maxPathSum(root));
    }
}
