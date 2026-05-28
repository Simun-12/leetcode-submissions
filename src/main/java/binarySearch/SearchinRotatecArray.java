package binarySearch;

public class SearchinRotatecArray {
    public static int bs(int[] nums, int target) {
    int index = -1;
    int low = 0;
    int high = nums.length -1 ;
    while(low<=high){
        int mid = low + (high-low)/2;
        if(nums[mid] == target) return mid;

        if(nums[low] <= nums[mid]){
            if(nums[low]<= target && nums[mid]>= target)
                high = mid-1;
            else
                low = mid +1;
        }
        else{
            if(nums[high]>= target && nums[mid]<= target)
                low = mid +1;
            else
                high = mid -1;
        }


    }
    return index;
    }
    public static void main(String[] args){
        int [] nums = {3,1};
        int target = 1;
        int index = bs(nums, target);
        System.out.println(index);
    }
}
