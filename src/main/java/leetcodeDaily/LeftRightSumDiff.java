package leetcodeDaily;

import java.util.Arrays;

public class LeftRightSumDiff {
//    public static int getLeftSum(int[] arr, int index){
//        if(index == 0) return 0;
//        int sum = 0;
//        for(int i =0; i<index; i++){
//            sum += arr[i];
//        }
//        return sum;
//    }
//    public static int getRightSum(int[] arr, int index){
//        if(index == arr.length-1) return 0;
//        int sum =0;
//        for(int i =index+1; i< arr.length; i++){
//            sum += arr[i];
//        }
//        return sum;
//    }
    public static int[] leftRightDifference(int[] nums) {
       int total =0, leftSum =0;
        for(int num:nums) total += num;
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            int rightSum = total-nums[i]-leftSum;
            nums[i] = Math.abs(rightSum-leftSum);
            leftSum += temp;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
