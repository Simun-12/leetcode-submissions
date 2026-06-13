package tree.medium;

public class PathSum {
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
    private static boolean helper(TreeNode root, int target,int sum){
        if(root == null) return false;
        sum += root.val;
        if(root.left == null && root.right== null) return sum == target;
        return helper(root.left, target, sum) || helper(root.right,target, sum);
    }
    public static boolean pathSum(TreeNode root, int target) {
      return helper(root,target,0);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int target = 10;
        System.out.println(pathSum(root,target));
    }
}
