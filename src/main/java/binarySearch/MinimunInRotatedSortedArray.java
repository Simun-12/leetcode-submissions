package binarySearch;

public class MinimunInRotatedSortedArray {
    public static int bs(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        while(low<high){
         int mid = low + (high-low)/2;
            if(nums[mid]>nums[high])
                low = mid +1;
            else high = mid;
        }
        return nums[low];
    }
    public static void main(String[] args){
        int[]  nums = {3,4,5,0,1,2};
        int ans = bs(nums);
        System.out.println(ans);
    }
}
