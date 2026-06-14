package tree.problems;

public class CountAllNodes {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    private static int leftHeight(TreeNode root) {
        if(root == null) return 0;
        return 1+leftHeight(root.left);
    }
    private static int rightHeight(TreeNode root) {
       if(root==null) return 0;
       return 1+rightHeight(root.right);
    }
    public static int countNodes(TreeNode root) {
        if (root == null) return 0;
        int lh = leftHeight(root);
        int rh = rightHeight(root);
        if (lh == rh) {
            return (1<<lh)-1;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return 1 + left + right;
    }
    public static void main(String[] args) {
        /*
                  1
                /   \
               2     3
              / \   /
             4   5 6

           Answer = 6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(countNodes(root));
    }
}
