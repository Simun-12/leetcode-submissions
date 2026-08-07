package dp;

import java.util.Arrays;

public class StoneGame3 {
    private static int helper(int index, int[] dp, int[] nums ){
        if(index>=nums.length) return 0;

        if(dp[index] != Integer.MIN_VALUE) return dp[index];

        int take1;
        int take2 = Integer.MIN_VALUE;
        int take3 = Integer.MIN_VALUE;

        int sum = nums[index];
        take1 = sum - helper(index+1,dp,nums);
        if (index + 1 <nums.length) {
            sum += nums[index + 1];
            take2 = sum - helper(index + 2,dp,nums);
        }
      if(index +2<nums.length){
          sum += nums[index+2];
          take3 = sum - helper(index+3,dp,nums);
      }

        return dp[index] = Math.max(take1,Math.max(take2,take3));


    }
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;

        int[]dp = new int[n];
        Arrays.fill(dp,Integer.MIN_VALUE);

        int scoreDiff = helper(0,dp,stoneValue);

        if(scoreDiff>0) return "Alice";
        else if (scoreDiff==0) {return "Tie";}
        else return "Bob";
    }
}
