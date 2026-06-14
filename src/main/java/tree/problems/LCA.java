package tree.problems;

public class LCA {
    private static class TreeNode{
        int val;
        TreeNode left ;
        TreeNode right;
        TreeNode(int val){
            this.val = val ;
            this.left = null;
            this.right = null;
        }
    }
    private static TreeNode helper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return root;
        if(root == p || root == q) return root;
        TreeNode left = helper(root.left,p,q);
        TreeNode right = helper(root.right,p,q);

        if(left!=null && right!=null) return root;
        if(left!=null && right==null) return left;
        return right;

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = helper(root,p,q);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);
    }
}
