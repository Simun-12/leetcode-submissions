package tree.problems;
public class SumRootLeafNums {
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
//    static int ans =0;
//    private static void helper(TreeNode root, int num){
//        if(root == null) return;
//        if(root.left == null && root.right == null){
//            ans += num;
//            return;
//        }
//        if(root.left!=null) helper(root.left, num*10+root.left.val);
//        if(root.right!=null) helper(root.right,num*10+root.right.val);
//    }
//    public static int sumNumbers(TreeNode root) {
//        helper(root,root.val);
//        return ans;
//    }
    private static int helper(TreeNode root, int num){
        if(root==null) return 0;
        num = num*10 + root.val;
        if(root.left == null && root.right == null) return num;
        return helper(root.left,num) + helper(root.right,num);
    }
    public static int sumNumbers(TreeNode root){
        int ans = helper(root,0);
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(sumNumbers(root));
    }
}
