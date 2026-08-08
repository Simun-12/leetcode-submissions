package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MarkElements {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        long[] ans = new long[queries.length];
        int m=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {if (a[0] != b[0]) return Integer.compare(a[0], b[0]);return Integer.compare(a[1], b[1]);});
        long sum = 0L;
        for(int num: nums) sum += num;
        boolean[] marked = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
        }

        for(int[] query:queries){
            int markIndex = query[0];
            int smallElemets = query[1];

            if (!marked[markIndex]) {
                marked[markIndex] = true;
                sum = sum -nums[markIndex];
            }

                while(smallElemets>0 && !pq.isEmpty()){
                    int[] curr = pq.poll();

                    int topVal = curr[0];
                    int topIndex = curr[1];

                    if (marked[topIndex])
                        continue;

                    sum -= topVal;
                    marked[topIndex] = true;
                    smallElemets--;

                }
                ans[m++] = sum;

        }

        return ans;
    }
}
