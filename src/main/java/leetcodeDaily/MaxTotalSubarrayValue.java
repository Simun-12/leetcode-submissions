package leetcodeDaily;

import java.util.Arrays;

public class MaxTotalSubarrayValue {
    public static long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        return (long)k*(max-min);
    }
    public static void main(String[] args){
        int[] nums = {1,3,2};
        int k = 2;
        System.out.println(maxTotalValue(nums,k));
    }
}
