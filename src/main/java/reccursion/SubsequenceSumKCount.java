package reccursion;

public class SubsequenceSumKCount {
    public static int helper(int index, int k, int sum, int[] nums){
        if(index == nums.length) return sum==k?1:0;
        int result =0;
        //take
        result = result + helper(index+1,k,sum+nums[index],nums);
        //not take
        result = result + helper(index+1,k,sum,nums);
        return result;
    }
    public static void main(String[] args){
        int[] nums = {10,1,2,7,6,1,5};
        int k = 8;
        System.out.println(helper(0,k,0,nums));
    }
}
