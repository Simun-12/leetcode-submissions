package arrays;

import java.util.Arrays;

public class PrefixCommonArray {
    public static int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n=a.length;
        int[] ans = new int[n];
        int common=0;
        int[] freqMap = new int[n+1];
        for(int i=0; i<n; i++){
            freqMap[a[i]]++;
            if(freqMap[a[i]]==2) common++;
            freqMap[b[i]]++;
            if(freqMap[b[i]]==2) common++;
            ans[i] = common;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] a = {1,3,2,4}, b = {3,1,2,4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(a, b)));
    }
}
