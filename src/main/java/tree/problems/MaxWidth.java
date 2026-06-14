package tree.problems;

import java.util.LinkedList;
import java.util.Queue;
public class MaxWidth {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

        private static class Pair {
            TreeNode node;
            long idx;

            Pair(TreeNode node, long idx) {
                this.node = node;
                this.idx = idx;
            }
        }

        public static int widthOfBinaryTree(TreeNode root) {
            if (root == null) return 0;
            long maxWidth = 0;
            Queue<Pair> q = new LinkedList<>();
            q.offer(new Pair(root, 0));
            while (!q.isEmpty()) {
                int size = q.size();
                long levelStart = q.peek().idx;
                long first = 0;
                long last = 0;
                for (int i = 0; i < size; i++) {
                    Pair curr = q.poll();
                    long idx = curr.idx - levelStart;
                    if (i == 0) first = idx;
                    if (i == size - 1) last = idx;
                    if (curr.node.left != null) {
                        q.offer(new Pair(curr.node.left, 2 * idx + 1));
                    }
                        if (curr.node.right != null) {
                            q.offer(new Pair(curr.node.right, 2 * idx + 2));
                        }
                    }
                    maxWidth = Math.max(maxWidth, last - first + 1);
                }
                return (int) maxWidth;
            }
        public static void main (String[]args){
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(3);
            root.right = new TreeNode(2);
            root.left.left = new TreeNode(5);
            root.left.right = new TreeNode(3);
            root.right.right = new TreeNode(9);
            System.out.println(widthOfBinaryTree(root)); // 4
        }
    }
