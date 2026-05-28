package reccursion;

public class SumofN {
   public static int helper(int n){
       if(n == 0) return 0;
       return n + helper(n-1);
   }
    public static void main(String[] args){
        int n = 10;
        int sum = helper(n);
        System.out.println(sum);
    }
}
