package arrays;

public class SmallestDivDigit {
    private int digitProd(int n){
        int prod =1;
        while(n>0){
            prod *= n%10;
            n=n/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        boolean flag = true;
        while(flag){
            int prod = digitProd(n);
            if(prod%t==0) flag=false;
            else n++;
        }
        return n;
    }
}
