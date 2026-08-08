package graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    private class Pair{
        int row;
        int col;
         Pair(int row, int col){
             this.row= row;
             this.col= col;
         }
    }
    public int orangesRotting(int[][] grid) {
     int m = grid.length;
     int n = grid[0].length;
     int steps =0,fresh=0;
     boolean[][] vis = new boolean[m][n];
     Queue<Pair> q = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n;j++){
               if(grid[i][j] ==2) {
                   q.offer(new Pair(i, j));
                   vis[i][j] = true;
               }
               if(grid[i][j] == 1)
                   fresh ++;
            }
        }

        int[][] dirs = {{0,-1},{0,1},{-1,0},{1,0}};

        while (!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Pair curr = q.poll();
                 for(int[] dir:dirs){
                     Pair nbr = new Pair(curr.row + dir[0], curr.col+dir[1]);
                     if (nbr.row >= 0 && nbr.row < m && nbr.col >= 0 && nbr.col < n) {
                             if (grid[nbr.row][nbr.col] == 1 && !vis[nbr.row][nbr.col]) {
                                 vis[nbr.row][nbr.col] = true;
                                 grid[nbr.row][nbr.col] = 2;
                                 fresh--;
                                 q.offer(new Pair(nbr.row, nbr.col));
                             }

                     }
                 }
            }
            steps++;
        }
        return fresh==0?steps-1:-1;
    }
}
