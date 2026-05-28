package arrays;

public class MajorityELement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count=0;
        int el =0;
        for(int i=0; i<n; i++){
            if(count ==0){
                count =1;
                el = nums[i];
            }
            else if(el != nums[i]){
                count--;
            }
            else count++;
        }
     return el;
    }
    public static void main(String[] args){
        int[] nums= {3,3,2,3,5,3,6};
        System.out.println(majorityElement(nums));
    }
}
