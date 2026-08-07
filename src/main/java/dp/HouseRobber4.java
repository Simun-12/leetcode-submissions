package dp;

import java.util.Arrays;

public class HouseRobber4 {
    private int helper(int[] nums, int i, int k, int[][]dp){
        if(k==0) return 0;
        if(i>=nums.length) return Integer.MAX_VALUE;
        if (dp[i][k] != -1)
            return dp[i][k];

        int include = Math.max(nums[i],helper(nums,i+2,k-1,dp));
        int exclude = helper(nums,i+1,k,dp);

        return dp[i][k] = Math.min(include,exclude);

    }
    public int minCapability(int[] nums, int k) {
     int[][] dp = new int[nums.length][k+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(nums,0,k,dp);
    }
}
