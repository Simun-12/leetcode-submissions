package arrays;

public class StockBuySell {
    public static int maxProfit(int[] prices) {
        int max =0;
        int minPrice = prices[0];
        int n = prices.length;
        for(int i=0;i<n-1; i++){
            minPrice= Math.min(minPrice,prices[i]);
                int profit = prices[i]-minPrice;
                 max = Math.max(profit,max);

        }
        return max;
    }
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
