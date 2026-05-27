package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArraySumKCount {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> prefixSum = new HashSet<>();
        prefixSum.add(0);
        int count =0;
        int sum =0;
        for (int num : nums) {
            sum += num;
            if (prefixSum.contains(sum - k)) {
                count ++;
            }
            prefixSum.add(sum);
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1};
         int k=2;
        System.out.println(subarraySum(nums,k));
    }
}
