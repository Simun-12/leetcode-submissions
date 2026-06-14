package tree.problems;

import com.sun.source.tree.Tree;

import java.time.temporal.Temporal;
import java.util.*;

public class NodesDisK {
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
    private static void createMap(TreeNode root, Map<TreeNode,TreeNode> map){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for (int i=0; i<size;i++){
                TreeNode curr = q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                    map.put(curr.left,curr);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                    map.put(curr.right,curr);
                }
            }
        }
    }
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        Map<TreeNode,TreeNode> map = new HashMap<>();
        createMap(root,map);
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> set = new HashSet<>();
        int distance =0;
        q.add(target);
        set.add(target);
        while (!q.isEmpty()){
            int size = q.size();
            if(distance == k){
                while (!q.isEmpty())
                    ans.add(q.poll().val);
                return ans;
            }
            for(int i=0;i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left!= null && !set.contains(curr.left)){
                    q.add(curr.left);
                    set.add(curr.left);
                }
                if(curr.right!=null && !set.contains(curr.right)){
                    q.add(curr.right);
                    set.add(curr.right);
                }
                 TreeNode parent = map.get(curr);
                if(parent!=null && !set.contains(parent)) {
                    q.add(parent);
                    set.add(parent);
                }
            }
            distance++;
        }
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

        TreeNode target = root.left;
        int k = 2;

        System.out.println(distanceK(root, target, k));
    }
}
