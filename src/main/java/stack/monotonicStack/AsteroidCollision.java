package stack.monotonicStack;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();


        for(int nums:asteroids){
            boolean destroyed= false;
            while(!stack.empty() &&(stack.peek()>0 && nums<0)){
                if(stack.peek() == Math.abs(nums)) {
                    stack.pop();
                    destroyed=true;
                    break;
                }
                else if(stack.peek()>-nums){
                    destroyed=true;
                    break;
                }
                else
                    stack.pop();
            }
            if(!destroyed)
                stack.add(nums);
        }
        int[] ans = new int[stack.size()];
       for(int i = stack.size()-1; i>=0; i--){
           ans[i] = stack.pop();
       }
        return ans;
    }
}
