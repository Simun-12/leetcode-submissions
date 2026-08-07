package dp.oneDDp;

import java.util.Arrays;

public class MinCostClimbingStairs {
    private int helper(int index,int[] dp, int[] cost){
        if(index==0|| index==1) return 0;
        if(dp[index] != -1) return dp[index];
        int twoStep =0;
        int oneStep = helper(index-1,dp,cost) + cost[index-1];
        if(index-2>=0) twoStep = helper(index-2,dp,cost) + cost[index-2];

        return dp[index] = Math.min(oneStep,twoStep);
    }
    public int minCostClimbingStairs(int[] cost) {
      int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        return helper(cost.length, dp, cost);
    }
}
