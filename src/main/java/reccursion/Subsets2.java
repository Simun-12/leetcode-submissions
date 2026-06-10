package reccursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class Subsets2 {
    private static void helper(int[] nums, List<List<Integer>> ans, List<Integer> curr, int index){
        if(index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        helper(nums,ans,curr,index+1);
        curr.remove(curr.size()-1 );

        int next = index+1;
        while(next <nums.length && nums[index] == nums[next]){
                next++;
        }

        helper(nums,ans,curr,next);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums,ans,curr,0);
        return ans;
    }
    public static void main(String[] args){
        int[]  nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
