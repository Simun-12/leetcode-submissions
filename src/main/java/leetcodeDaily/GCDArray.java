package leetcodeDaily;

import java.util.Arrays;

public class GCDArray {
    public static int findGCD(int[] nums) {
       int ans =1;
      Arrays.sort(nums);
      int min = nums[0];
      int max = nums[nums.length-1];
      for(int i=1; i<=min;i++){
          if(min%i==0 && max%i==0)
              ans =i;
      }
      return ans;
    }
    public static void main(String[] arg){
        int[]  nums = {3,3};
        System.out.println(findGCD(nums));
    }
}
