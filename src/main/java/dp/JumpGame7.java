package dp;

import java.util.Arrays;

public class JumpGame7 {
    public static boolean helper(String s, int min , int max, Boolean[] dp, int index){
        if(index == s.length() -1) return true;
        if(dp[index] != null) return dp[index];
        int n= s.length();
        //minJump
       for(int nextIndex = index + min; nextIndex<=Math.min(index + max, n- 1); nextIndex++){
            if(s.charAt(nextIndex)=='0'){
                if(helper(s,min,max,dp,nextIndex))
                    return dp[index]=true;
            }
       }
       return dp[index]=false;
    }
    public static boolean canReach(String s, int minJump, int maxJump) {
        Boolean[] dp = new Boolean[s.length()];
        if (s.charAt(0) == '1') return false;
        return(helper(s,minJump,maxJump,dp,0));
    }
    public static void main(String[] args){
        String  s = "011010";
        int minJump = 2, maxJump = 3;
        System.out.println(canReach(s,minJump,maxJump));
    }
}
