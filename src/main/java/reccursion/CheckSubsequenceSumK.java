package reccursion;

public class CheckSubsequenceSumK {
    private static boolean helper(int index, int k, int sum, int[] nums){
        if(sum == k) return true;
        if(index == nums.length) return false;
       return helper(index+1,k, sum+nums[index],nums) ||
        helper(index+1,k, sum,nums);
    }
    public static  void main(String[] args) {
        int[] nums = {4, 9, 2, 5, 1};
        int k = 10;
        System.out.println(helper(0,k,0,nums));
    }
}
