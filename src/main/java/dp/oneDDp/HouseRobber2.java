package dp.oneDDp;

import java.util.Arrays;

public class HouseRobber2 {
    private int helper(int index, int[] nums, int[] dp, int end){
        if(index > end) return 0;

        if(dp[index] != -1) return dp[index];
        int take = helper(index+2, nums, dp,end) + nums[index];
         int notTake = helper(index+1,nums,dp,end);

        return dp[index] = Math.max(take,notTake);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[n-1];
        int[] dp1 = new int[n+1];
        int[] dp2 = new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int incFirst = helper(0,nums,dp1,n-2);
        int excFirst = helper(1,nums,dp2,n-1);

        return Math.max(excFirst,incFirst);
    }
}
