package arrays;

public class RemoveDupe {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 1;
        int n = nums.length;
        int count=1;
        while(fast<n){
            if(nums[slow] == nums[fast]){
                fast++;
            }
            else{
                count++;
                nums[slow+1] = nums[fast];
                slow++;
                fast++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
