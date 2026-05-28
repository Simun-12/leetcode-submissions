package arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums.length<3) {
           for(int num:nums){
               ans.add(num);
           }
        }
        int c1=0,c2=0,el1=0,el2=0;
        for(int num:nums){
            if(num == el1){
                c1++;
            }
            else if(num == el2){
                c2++;
            }
            else if(c1 == 0){
                el1 = num;
                c1 = 1;
            }
            else if(c2 == 0){
                el2 = num;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
        }
        int freq1 = 0,freq2 = 0;
        for(int num : nums){
            if(num == el1) freq1++;
            else if(num == el2) freq2++;
        }
        if(freq1 > nums.length/3) ans.add(el1);
        if(freq2 > nums.length/3) ans.add(el2);
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
