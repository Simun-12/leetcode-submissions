package graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    private class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row= row;
            this.col= col;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        if (image[sr][sc] == color)
            return image;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(sr,sc));

        int[][] dirs = {{0,-1},{0,1},{-1,0},{1,0}};
        int currColor = image[sr][sc];
        while (!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
               Pair curr = q.poll();
                image[curr.row][curr.col] =color;
                for(int[] dir:dirs){
                    Pair nbr = new Pair(curr.row + dir[0], curr.col+dir[1]);
                    if (nbr.row >= 0 && nbr.row < m && nbr.col >= 0 && nbr.col < n) {
                        if (image[nbr.row][nbr.col] == currColor) {
                            image[nbr.row][nbr.col] = color;
                            q.offer(new Pair(nbr.row, nbr.col));
                        }

                    }
                }
            }

        }
        return image;

    }
}
