package stack.monotonicStack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NGE2 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i =0; i<2*n; i++){
            int ind = i%n;
            while(!stack.empty() && nums[ind]>nums[stack.peek()]){
               ans[stack.pop()] = nums[ind];
            }
            if(i<n)
             stack.push(ind);
        }
        return ans;
    }
}
