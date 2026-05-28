package arrays;

import java.util.Arrays;

public class SortColors {
    public static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        int low= 0;
        int high = nums.length -1;
        int mid = 0;
            while(mid<=high){
                if(nums[mid] == 0){
                    swap(nums,low,mid);
                    low++;
                    mid++;
                }
                if(nums[mid] == 1){
                    mid++;
                }
                if(nums[mid] == 2){
                    swap(nums,mid,high);
                    high--;
                }
        }
            return nums;
    }
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}
