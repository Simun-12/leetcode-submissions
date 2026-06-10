package reccursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class Subsets1 {
    private static void helper(int[] nums, List<Integer> ans, int index, int sum){
        if(index == nums.length) {
            ans.add(sum);
            return;
        }
        helper(nums,ans,index+1, sum+nums[index]);

        int next = index+1;
        while(next <nums.length && nums[index] == nums[next]){
            next++;
        }
        helper(nums,ans,next,sum);
    }
    public static List<Integer> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        helper(nums,ans,0,0);
        return ans;
    }
    public static void main(String[] args){
        int[]  nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
