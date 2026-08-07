package dp.oneDDp;

import java.util.Arrays;

public class ClimbingStairs {
    private int helper(int i, int[] dp, int n){
        if(i==n) return 1;
        if(dp[i]!=-1) return dp[i];
        int twoStep=0;

        //1 step
        int oneStep = helper(i+1,dp,n);

        //2steps
        if(i+2<=n)  twoStep = helper(i+2,dp,n);

        return dp[i] = oneStep+twoStep;
    }
    public int climbStairs(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(1,dp,n);
    }
}
