package stack;

import java.util.Arrays;
import java.util.Stack;

public class SmallestDistinctSubsequence {
    public String smallestSubsequence(String s) {
     int[] freq = new int[26];
     for(char ch: s.toCharArray()){
         freq[ch-'a']++;
     }
     boolean[] vis = new boolean[26];
     Arrays.fill(vis,false);
     Stack<Character> stack = new Stack<>();

     for(char ch: s.toCharArray()){
         if(vis[ch-'a']){
             freq[ch-'a']--;
             continue;
         }
         while(!stack.empty()){
             if(stack.peek()<ch){
                 break;
             }
             if(stack.peek()>ch){
                if(freq[stack.peek()-'a']>0) {
                    char top = stack.peek();
                    stack.pop();
                    vis[top - 'a'] = false;
                }
                else break;
             }
         }
         stack.add(ch);
         freq[ch-'a']--;
         vis[ch-'a'] = true;
     }
     StringBuilder sb = new StringBuilder();
     while(!stack.empty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
