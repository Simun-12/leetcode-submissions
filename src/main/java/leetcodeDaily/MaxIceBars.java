package leetcodeDaily;

import java.util.Arrays;

public class MaxIceBars {

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans =0,sum=0;
        if(costs[0]>coins) return 0;
        for(int cost:costs){
            sum += cost;
            if(sum>coins){
                break;
            }
            ans++;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        System.out.println(maxIceCream(costs,coins));
    }
}
