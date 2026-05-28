package dp;


import java.util.Arrays;

public class JumpGame5 {
    public static int helper(int index, int[] arr, int d, int[]dp){

        if(dp[index] != -1) return dp[index];
        int maxRight =1, maxLeft=1;
        for (int i = index + 1; i <= Math.min(index + d, arr.length - 1); i++) {
            if (arr[i] >= arr[index]) break;
            maxRight = Math.max(maxRight, 1 + helper(i, arr, d, dp));
        }

        for (int i = index - 1; i >= Math.max(index - d, 0); i--) {
            if (arr[i] >= arr[index]) break;
            maxLeft = Math.max(maxLeft, 1 + helper(i, arr, d, dp));
        }
        return dp[index] = Math.max(maxLeft,maxRight);
    }
    public static int maxJumps(int[] arr, int d) {
        int ans=1;
        int n = arr .length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        for(int i=0; i<n; i++){
            ans = Math.max(ans, helper(i,arr,d,dp));
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {6,4,14,6,8,13,9,7,10,6,12};
        int d =2;
        System.out.println(maxJumps(arr,d));
    }
}
