package leetcodeDaily;

import java.util.Arrays;

public class PivotPartion {
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int left =0;
        int right = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                ans[left]= nums[i];
                left++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] == pivot){
                ans[left] = nums[i];
                left++;
            }
        }
        for (int i =0; i<nums.length; i++){
            if(nums[i]>pivot){
                ans[left] = nums[i];
                left++;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[]  nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }
}
