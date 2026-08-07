package dp.oneDDp;

import java.util.Arrays;

public class HouseRobber {
    private int helper(int index, int[] nums, int[] dp){
        if(index >= nums.length) return 0;
        if(dp[index] != -1) return dp[index];

        int take = helper(index+2, nums, dp) + nums[index];
        int notTake = helper(index+1,nums,dp);

        return dp[index] = Math.max(take,notTake);
    }

    public int rob(int[] nums) {
     int n = nums.length;
     int[] dp = new int[n+1];
     Arrays.fill(dp,-1);
     return helper(0,nums,dp);
    }
}
