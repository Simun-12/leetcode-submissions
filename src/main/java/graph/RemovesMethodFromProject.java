package graph;

import java.util.*;

public class RemovesMethodFromProject {
    private void bfs(Map<Integer, ArrayList<Integer>> graph, int[]vis, int k){
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        vis[k] = 0; // suspicious

        while (!q.isEmpty()) {
            int curr = q.poll();

            if (graph.containsKey(curr)) {
                for (int nbr : graph.get(curr)) {
                    if (vis[nbr] == -1) {
                        vis[nbr] = 0;
                        q.add(nbr);
                    }
                }
            }
        }
    }
    private  Map<Integer, ArrayList<Integer>> adjList(int[][] edges){
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int[] edge: edges){
            if(!graph.containsKey(edge[0])){
                graph.put(edge[0],new ArrayList<>());
            }
            graph.get(edge[0]).add(edge[1]);
        }
        return graph;
    }
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        Map<Integer, ArrayList<Integer>> graph = adjList(invocations);
        int[] vis = new int[n];
        Arrays.fill(vis,-1);
        bfs(graph,vis,k);
        List<Integer> ans = new ArrayList<>();

        for (int[] edge : invocations) {
            if (vis[edge[0]] == -1 && vis[edge[1]] == 0) {
                for (int i = 0; i < n; i++)
                    ans.add(i);
                return ans;     // cannot remove anything
            }
        }
        for (int i = 0; i < n; i++) {
            if (vis[i] == -1) {
                ans.add(i);
            }
        }
        return ans;
    }
}
