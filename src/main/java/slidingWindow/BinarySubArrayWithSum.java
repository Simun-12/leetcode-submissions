package slidingWindow;

public class BinarySubArrayWithSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
      int count=0,sum=0;
      int left=0,right=0;
      while(right<nums.length){
          sum += nums[right];
          if(sum>goal){
              count++;
              left++;
              sum = sum - nums[left];
              right--;
          }
          else right++;
      }
      return count;
    }
    public static void main(String[] args){
        int[]  nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums,goal));
    }
}
