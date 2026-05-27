package arrays;

import java.util.Arrays;

public class MoveZero {
    public static int[] moveZeroes(int[] nums) {
      int slow = 0;
      int fast = 1;
      while(fast<nums.length){
          if(nums[slow]== 0 && nums[fast]!= 0){
              nums[slow] = nums[fast];
              nums[fast] = 0;
              slow++;
              fast++;
          }
         else if(nums[slow]== 0 && nums[fast]== 0){
              fast++;
          }
         else{
             slow++;
             fast++;
          }

      }
      return nums;
    }
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
