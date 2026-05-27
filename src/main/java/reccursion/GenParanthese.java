package reccursion;

import java.util.ArrayList;
import java.util.List;

public class GenParanthese {
    public static void helper(int n, int open, int close, List<String> ans, String current){
        if(current.length() == 2*n){
            ans.add(current);
            return;
        }


        if(open<n){
            helper(n,open+1,close,ans, current + "(");
        }
        if(close<open){
            helper(n,open,close+1,ans,current + ")");
        }

    }
    public static  List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n,0,0,ans,"");
        return ans;
    }
    public static void main(String[] args){
        int n = 3;
        List<String> ans = generateParenthesis(n);
        System.out.println(ans);
    }
}
