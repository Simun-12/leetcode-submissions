package slidingWindow;

public class BinarySubArrayWithSum {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int[] prefixSum = new int[nums.length];
        int count=0;
        prefixSum[0] = nums[0];
        for(int i=1; i<nums.length;i++){
               prefixSum[i] = prefixSum[i-1]+ nums[i];
               if(prefixSum[i]==goal) count++;
               if(prefixSum[i]-nums[i]==goal) count++;

        }
        return count;
    }
    public static void main(String[] args){
        int[]  nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(nums,goal));
    }
}
