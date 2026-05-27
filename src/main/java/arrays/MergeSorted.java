package arrays;

import java.util.Arrays;

public class MergeSorted {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-n-1;
        int j = n-1;
        int k = m-1;
        while(i>=0 && j>=0){
            if(nums1[i]<= nums2[j]){
                nums1[k] = nums2[j];
                k--;
                j--;
            }
            else{
                nums1[k] = nums1[i];
                k--;
                i--;
            }
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }

        return nums1;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0},nums2 = {2,5,6};
        int m=6, n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
}
