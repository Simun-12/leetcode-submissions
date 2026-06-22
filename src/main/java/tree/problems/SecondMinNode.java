package tree.problems;

public class SecondMinNode {

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
    private static int dfs(TreeNode root, int minval){
        if(root==null) return Integer.MAX_VALUE;

        if(root.val>minval) return root.val;

        int left = dfs(root.left,minval);
        int right = dfs(root.right,minval);

        return Math.min(left,right);


    }
    public static int findSecondMinimumValue(TreeNode root) {
     int ans = dfs(root,root.val);
     return ans==Integer.MAX_VALUE?-1:ans;
    }

    public static void main(String[] args){
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(5);
        root1.right.left = new TreeNode(5);
        root1.right.right = new TreeNode(7);
        System.out.println(findSecondMinimumValue(root1));
    }
}
