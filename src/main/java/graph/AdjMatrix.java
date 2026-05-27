package graph;

import java.util.*;

public class AdjMatrix {

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
                {1, 4},
                {1, 2},
                {2, 3}
        };

        int n = maxVertex(edges);
        int[][] adjMat = new int[n + 1][n + 1];

        adjMatrix(adjMat, edges, n);
    }
}