package dp.twoDDp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinPathSum {
    private int helper(int i, int j, int m, int n, int[][] dp, int[][] grid){
        if(i>m || j>n) return Integer.MAX_VALUE;
        if(i ==m-1 && j== n-1) return grid[i][j];
        if(dp[i][j] !=-1) return dp[i][j];

        int down = helper(i+1,j,m,n,dp,grid);
        int right = helper(i,j+1,m,n,dp,grid);
        int min = Math.min(down,right);
        if(min == Integer.MAX_VALUE) return dp[i][j] = min;

        return dp[i][j] = grid[i][j] + min;
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n= grid[0].length;
        int[][] dp = new int[m][n];
        for(int[]d:dp){
            Arrays.fill(d,-1);
        }
        return helper(0,0,m,n,dp,grid);
    }
}
