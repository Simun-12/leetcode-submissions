package stack;

import java.util.Stack;

public class ConpetetiveSubsequence {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<nums.length; i++){
            while(!stack.empty() && stack.peek()>nums[i] && stack.size()-1 + (n-i) >=k) {
                stack.pop();
            }
            stack.add(nums[i]);
        }
        for(int i= k-1; i>=0; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}
