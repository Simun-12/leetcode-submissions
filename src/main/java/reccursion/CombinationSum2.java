package reccursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    private static void helper(int[] candidates, int target, List<List<Integer>> ans, int index, int sum, List<Integer> current){
        if(sum>target) return;
        if(index == candidates.length){
            if(sum == target){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        current.add(candidates[index]);
        helper(candidates,target,ans,index+1,sum+candidates[index],current);
        current.remove(current.size()-1);

        int next = index + 1;
        while (next < candidates.length &&
                candidates[next] == candidates[index]) {
            next++;
        }
        helper(candidates,target,ans,next,sum,current);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(candidates,target,ans,0,0,current);
        return ans;
    }
    public static void main(String[] args){
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum(candidates,target));
    }
}
