package dp.twoDDp;

import java.util.Arrays;

public class UniquePath2 {
    private int helper(int i, int j, int[][] grid, int m, int n){
        if(i>=m || j>=n) return 0;
        if(i ==m-1 && j==n-1) return 1;
        int right =0, down =0;
        if (grid[i][j] != -2) return grid[i][j];
        if(grid[i][j] != -1) down = helper(i,j+1,grid,m,n); else return 0;
        if(grid[i][j] != -1) right = helper(i+1,j,grid,m,n); else return 0;

        return grid[i][j] = down + right;

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
     int m = obstacleGrid.length;
     int n = obstacleGrid[0].length;
     if (obstacleGrid[0][0] == 1) return 0;
     if(obstacleGrid[m-1][n-1] == 1) return 0;
      for(int i=0; i<m; i++){
          for(int j= 0; j<n; j++){
            if(obstacleGrid[i][j] == 1) obstacleGrid[i][j] = -1; else obstacleGrid[i][j] = -2;
          }
      }
     return helper(0,0,obstacleGrid,m,n);
    }
}
