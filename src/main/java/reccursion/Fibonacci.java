package reccursion;

public class Fibonacci {
   public static int series(int n){
       if(n==0) return 0;
       if(n == 1) return 1;
       int s = series(n-1) + series(n-2);
        return s;
   }
    public static void main(String[] args){
        int n = 10;
        System.out.println("Fibonacci Series");
        for(int i =0; i<n; i++){
            System.out.print(series(i) +" ");
        }
    }
}
