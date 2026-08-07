package dp.dpOnTree;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber3 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
         TreeNode(int val){
             this.val = val;
             this.left=null;
             this.right=null;
         }
    }
    private int helper(TreeNode root, Map map){
        if(root == null) return 0;
        if(map.containsKey(root)) return (int) map.get(root);
        int rob = root.val;

        if(root.left!=null){
            rob += helper(root.left.left,map);
            rob += helper(root.left.right,map);
        }
        if(root.right!=null){
            rob+= helper(root.right.left,map);
            rob += helper(root.right.right,map);
        }

        int notRob= helper(root.left,map) + helper(root.right,map);

       int ans = Math.max(rob,notRob);
       map.put(root,ans);
       return ans;
    }

    public int rob(TreeNode root) {
        Map<TreeNode,Integer> map = new HashMap<>();
       return helper(root,map);
    }
}
