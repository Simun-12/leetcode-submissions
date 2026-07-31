package stack;

import java.util.Stack;

public class SmallestKlenSubsequence {
    public String smallestSubsequence(String s, int k, char letter, int repetition) {
    Stack<Character> stack = new Stack<>();
    int letterInString =0;
    int letterInStack=0;
    int n = s.length();
    for(char ch:s.toCharArray()){
        if(ch==letter)
            letterInString++;
    }
    for(int i=0;i<s.length();i++){
        char curr = s.charAt(i);
        //adding required letter
        if(curr == letter){
            letterInString--;
        }

        while(!stack.isEmpty() && stack.peek()>curr && stack.size()-1 + (n-i) >=k &&(stack.peek()!=letter || letterInStack-1 +letterInString >=repetition) ){
            if(stack.pop()==letter){
                letterInStack--;
            }
        }
        if(stack.size() == k){
            continue;
        }
        if(curr == letter){
            stack.add(curr);
            letterInStack++;
        }else{
            if(k-stack.size()>repetition-letterInStack)
                stack.add(curr);
        }
    }
     StringBuilder sb = new StringBuilder();
     while(!stack.isEmpty()){
         sb.append(stack.pop());
     }
     sb.reverse();
     return sb.toString();
    }
}
