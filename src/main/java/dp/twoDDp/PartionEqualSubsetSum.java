package dp.twoDDp;

public class PartionEqualSubsetSum {
    private boolean helper(int i, int n, int k, Boolean[][] dp, int sum, int[] nums) {
        if (sum ==k) return true;
        if (i >= n || sum> k) return false;

        if (dp[i][sum] != null)
            return dp[i][sum];

        boolean take = helper(i + 1, n, k, dp, sum + nums[i], nums);
        boolean notTake = helper(i + 1, n, k, dp, sum, nums);

        return dp[i][sum] = take || notTake;
    }

    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int num : nums)
            sum += num;
        if (sum % 2 != 0) return false;
        Boolean[][] dp = new Boolean[n][sum / 2 + 1];

        return helper(0, n, sum / 2, dp, 0, nums);
    }
}
