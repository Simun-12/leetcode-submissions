package heap;

import java.util.PriorityQueue;

public class KthLargest {
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i< n; i++){
            pq.add(nums[i]);
            if(pq.size()==k){
                pq.poll();
            }
        }
        return pq.poll();
    }
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
}
