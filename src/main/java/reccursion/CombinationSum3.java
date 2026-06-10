package reccursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    private static void helper(int n, int k, List<List<Integer>> ans , List<Integer> curr, int val, int sum){
        if(sum == n && curr.size()==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(val>9 || sum>n || curr.size()>k) return;

        curr.add(val);
        helper(n,k,ans,curr,val+1,sum+val);
        curr.remove(curr.size()-1);

        helper(n,k,ans,curr,val+1,sum);

    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(n,k,ans,curr,1,0);
        return ans;
    }
    public static void main(String[] args){
        int k = 3, n = 7;
        System.out.println(combinationSum3(k,n));
    }
}
