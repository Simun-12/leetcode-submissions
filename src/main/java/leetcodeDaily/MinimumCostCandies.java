package leetcodeDaily;

import java.util.Arrays;

public class MinimumCostCandies {
    public static int minimumCost(int[] cost) {
            Arrays.sort(cost);
            int ans = 0;
            for (int i = cost.length - 1; i >= 0; i -= 3) {
                ans += cost[i];
                if (i - 1 >= 0)
                    ans += cost[i - 1];
            }
            return ans;
    }
    public static void main(String[] args){
        int[] cost = {6,5,7,9,2,2};
        System.out.println(minimumCost(cost));
    }
}
