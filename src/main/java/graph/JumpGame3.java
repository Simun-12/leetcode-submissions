package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JumpGame3 {
  public static boolean canReach(int[] arr, int start) {
    int n = arr.length;
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while(!q.isEmpty()){
            int index = q.poll();
            if(arr[index] == 0) return true;

            int nbr1 = index + arr[index];
            int nbr2 = index - arr[index];

            if(nbr1<n && nbr1>=0 && !vis[nbr1] ){
                vis[nbr1] = true;
                q.add(nbr1);
            }
            if(nbr2>=0 && nbr2<n && !vis[nbr2]){
                vis[nbr2] = true;
                q.add(nbr2);
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {4,2,3,0,3,1,2};
        int start = 5;
        System.out.println(canReach(arr,start));
    }
}
