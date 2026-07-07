package leetcodeDaily;

import java.util.Arrays;

public class MaxElement {
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length-1;
        if(arr[0]!=1) arr[0] =1;
        for (int i = 1; i < arr.length; i++) {
           if(!(Math.abs(arr[i]-arr[i-1])<=1)){
               arr[i] = arr[i-1] +1;
           }
        }
      return arr[n];
    }
    public static void main(String[] args){
        int[] arr = {2,2,1,2,1};
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));
    }
}
