package arrays;

public class MaxProdSubarray {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int currProd = 1;
        for (int num : nums) {
            currProd *= num;
            max1 = Math.max(max1, currProd);
            if (num == 0) currProd = 1;
        }
        currProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            currProd *= nums[i];
            max2 = Math.max(max2, currProd);
            if (nums[i] == 0) currProd = 1;
        }
        return Math.max(max1, max2);
    }
}
