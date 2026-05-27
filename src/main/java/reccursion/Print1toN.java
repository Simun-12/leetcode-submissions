package reccursion;

public class Print1toN {
    public static void series( int n){
        if(n == 0) return;
         series(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args){
        int n = 10;
        series(n);
    }
}
