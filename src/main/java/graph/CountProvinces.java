package graph;

import java.util.LinkedList;
import java.util.Queue;

public class CountProvinces {
    private static void bfs(int node, int[][] graph, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        vis[node] = true;
        int count =0;
        while(!q.isEmpty()){
          int curr = q.poll();
            for(int i=0; i< graph.length; i++){
                if(graph[curr][i] == 1 && !vis[i]){
                    q.add(i);
                    vis[i] = true;
                }
                count ++;

            }
        }
    }
    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                provinces++;
                bfs(i, isConnected, vis);
            }
        }
        return provinces;
    }
    public static void main(String[] args) {
        int[][] graph = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        System.out.println(findCircleNum(graph));
    }
}
