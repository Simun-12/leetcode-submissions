package arrays;

public class MaxSubarraySum {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sum = 0;
        int fast =0;
        while(fast < n){
            sum = sum + nums[fast];
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
            }
            fast++;
        }
        return max;
    }
    public static void main(String[] args){
        int[]  nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
