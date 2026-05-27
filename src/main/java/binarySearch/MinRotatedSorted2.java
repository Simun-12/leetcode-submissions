package binarySearch;

public class MinRotatedSorted2 {
    public static int findMin(int[] nums) {
    int n = nums.length;
    int low = 0;
    int high = n-1;
    while(low<high){
        int mid = low + (high - low) / 2;

        if(nums[mid]>nums[high])
            low = mid +1;
        else if(nums[mid]<nums[high])
            high = mid;
        else high --;
    }
    return nums[low];
    }
    public static void main(String[] args){
        int[] nums = {2,2,2,0,1};
        System.out.println(findMin(nums));
    }
}
