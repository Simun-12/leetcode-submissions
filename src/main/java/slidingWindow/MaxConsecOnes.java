package slidingWindow;

public class MaxConsecOnes {
    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int count = 0;
        int left = 0, right;
        int temp =k;
        for (right = 0; right < nums.length; right++) {
            if(nums[right]==1) count++;
            if(nums[right]==0) {
                temp--;
            }
            if(temp==0 && nums[right]==0){
                left++;
                temp=k;
                max = Math.max(count,max);
            }
        }

        return max;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        System.out.println(longestOnes(nums,k));
    }
}
