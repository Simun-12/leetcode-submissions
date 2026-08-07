package binarySearch;

import java.util.Arrays;

public class HouseRobber4 {
    private boolean canRob(int cap, int[] nums, int k){
      boolean canRob = false;
      int count =k,i=0;
     while(i<nums.length){
          if(nums[i]<=cap){
              count --;
              if(count==0) return true;
              i+= 2;
          }
          else i++;
      }
      return false;
    }
    public int minCapability(int[] nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int x : nums) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }
         int mid =0;
         while(low<=high){
              mid = low + (high-low)/2;
              if(!canRob(mid,nums,k)){
                  low = mid+1;
              }
              else high = mid-1;
         }
        return low;
    }
}
