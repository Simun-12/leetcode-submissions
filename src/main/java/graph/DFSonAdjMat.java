package graph;

import java.sql.Array;
import java.util.ArrayList;

public class DFSonAdjMat {

    public static void dfs(int node, int [][] adjMat, ArrayList<Integer> values, int n,int [] visited){
          visited[node] = 1;
         values.add(node);
       System.out.print(node);
          for(int j=0; j<=n; j++){
              if(adjMat[node][j]==1 && visited[j]!=1)
                  dfs(j,adjMat,values,n,visited);
          }

    }
    public static void adjMatrix(int[][] adjMat, int[][] edges, int n){

        for(int[] edge : edges){
            int a = edge[0], b = edge[1];
            adjMat[a][b] = 1;
            adjMat[b][a] = 1;
        }

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maxVertex(int[][] edges) {
        int max = 0;
        for(int[] edge : edges){
            max = Math.max(max, Math.max(edge[0], edge[1]));
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] edges = {
                {0, 1},
                {1, 2},
                {1, 4},
                {2, 3}
        };

        int n = maxVertex(edges);
        int[][] adjMat = new int[n + 1][n + 1];

        adjMatrix(adjMat, edges, n);
        int[] visited = new int[n+1];

        ArrayList<Integer> values = new ArrayList<>();

        dfs(0,adjMat,values, n, visited);
    }
}
