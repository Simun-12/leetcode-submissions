package leetcodeDaily;

public class SumMultiply {
    private static int reverse(int n){
        int revNum = 0;
        while(n>0){
            revNum = revNum*10 + n%10;
            n = n/10;
        }
        return revNum;
    }
    public static long sumAndMultiply(int n) {
      int newNum = 0;
      int sum=0;
      int num = reverse(n);
      while(num>0){
          if(num%10 !=0)
          {
              newNum = newNum*10 + num%10;
              sum += num%10;
          }
          num = num/10;
      }
      return newNum*sum;
    }
    public static void main(String[] args){
      int  n = 10203004;
        System.out.println(sumAndMultiply(n));
    }
}

