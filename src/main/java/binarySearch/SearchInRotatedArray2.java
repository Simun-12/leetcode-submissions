package binarySearch;

public class SearchInRotatedArray2 {
    public static boolean bs(int[] nums, int target) {
       boolean ans = false;
        int low = 0;
        int high = nums.length -1 ;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return true;
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
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
        return ans;
    }
    public static void main(String[] args){
        int [] nums = {2,5,6,0,0,1,2};
        int target = 7;
        boolean ans = bs(nums, target);
        System.out.println(ans);
    }
}
