package reccursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private static void helper(int[] candidates, int target, List<List<Integer>> ans, int index, int sum, List<Integer> current){
       if(sum>target) return;
        if(index == candidates.length){
            if(sum == target){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        current.add(candidates[index]);
        helper(candidates,target,ans,index,sum+candidates[index],current);
        current.remove(current.size()-1);

        helper(candidates,target,ans,index+1,sum,current);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(candidates,target,ans,0,0,current);
        return ans;
    }
    public static void main(String[] args){
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates,target));
    }
}
