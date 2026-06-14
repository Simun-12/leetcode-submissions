package tree.problems;

public class DiameterOfBinaryTree {

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
    private static int max=0;
    private static int helper(TreeNode root){
        if(root == null) return 0;
        int lh = helper(root.left);
        int rh = helper(root.right);
        max = Math.max(max,lh+rh);
        return 1 + Math.max(lh,rh);

    }
    public static int diameterOfBinaryTree(TreeNode root) {
        max=0;
        return helper(root);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(diameterOfBinaryTree(root));
    }
}
