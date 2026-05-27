package arrays;

import java.util.HashSet;

public class LongestCommonPrefix {
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        int max =0;
        HashSet<Integer> set = new HashSet<>();
         for(int nums:arr1) {
             while (nums > 0) {
                 set.add(nums);
                 nums = nums / 10;
             }
         }
             for(int vals:arr2){
                 int c=0;
                 while(vals>0){
                     if(set.contains(vals)){
                         c= String.valueOf(vals).length();
                         max= Math.max(c,max);
                     }
                     vals = vals/10;
                 }
             }


        return max;
    }
    public static void main(String[] args){
        int[] arr1 = {1,10,100}, arr2 = {1000};
        System.out.println(longestCommonPrefix(arr1,arr2));
    }
}
