package stack;

import java.util.Stack;

public class ValidParethese {
    public boolean checkValidString(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '*')
                stack.push(ch);
           else {
                if (stack.empty()) return false;
                stack.pop();
            }

        }
        if (stack.empty()) return true;
        else if (!stack.isEmpty()) {
            while (!stack.isEmpty()){
                if(stack.pop() == '(')
                    return false;
            }
        }
       return true;
    }
}
