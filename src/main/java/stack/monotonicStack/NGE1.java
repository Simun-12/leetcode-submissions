package stack.monotonicStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NGE1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n2; i++){
            while(!stack.empty() && stack.peek()<nums2[i]){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while (!stack.empty()){
            map.put(stack.pop(),-1);
        }
        for(int i=0; i<n1; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
