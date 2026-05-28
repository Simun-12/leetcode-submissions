package arrays;

public class RotateArraybyK {
    static void reverse(int[] nums, int low, int high) {

        while (low < high) {

            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int m = k%n;
            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);

    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
}
