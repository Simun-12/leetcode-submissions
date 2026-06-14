package tree.problems;

public class LongestUniValuePath {
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
         TreeNode(int val){
             this.val = val;
             this.left =null;
             this.right = null;
         }
    }
    private static int max=0;
    public static int helper(TreeNode root){
        if(root == null) return 0;
        int lh = helper(root.left);
        int rh = helper(root.right);
        int l=0;
        int r=0;
        if(root.left !=null && root.val == root.left.val){
            l = lh+1;
        }
        if(root.right !=null && root.val == root.right.val){
            r = rh+1;
        }
        max = Math.max(max, l+r);
        return Math.max(l,r);
    }
    public static int longestUnivaluePath(TreeNode root) {
        max=0;
         helper(root);
         return max;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(1);
        System.out.println(longestUnivaluePath(root));
    }
}
