package binarySearch;

import java.util.Arrays;

public class SuccessfullPair {

    public static int bs(int[] potions, long target){
        int ans = potions.length;
        int low = 0, high = potions.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(potions[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];

        for (int i = 0; i < spells.length; i++){
            long target = (success + spells[i] - 1) / spells[i];
            int index = bs(potions, target);
            ans[i] = potions.length - index;
        }
        return ans;
    }

    public static void main(String[] args){
        int[] spells = {5,1,3}, potions = {1,2,3,4,5};
        long success = 7;
        int[] ans = successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(ans));
    }
}