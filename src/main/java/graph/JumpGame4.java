package graph;

import java.util.*;

public class JumpGame4 {
//Done using Explicit graph BFS, can cause TLE due to building graph.
    public static Map<Integer, ArrayList<Integer>> createAdjList(int[] nums ){
        Map<Integer, ArrayList<Integer>> indicesMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            if(!indicesMap.containsKey(a)){
                indicesMap.put(a, new ArrayList<>());
            }
            indicesMap.get(a).add(i);
        }

        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int a = nums[i];
            graph.put(i, new ArrayList<>());
            if(i<nums.length-1){
                graph.get(i).add(i+1);
            }
            if(i>0){
                graph.get(i).add(i-1);
            }
            for(int j:indicesMap.get(a)){
                if(i!=j){
                    graph.get(i).add(j);
                }
            }
        }
        return graph;
    }
    public static int minJumps(int[] nums) {
        int min = 0;
        if(nums.length == 1) return 0;
        if(nums[0] == nums[nums.length-1]) return 1;
        Map<Integer, ArrayList<Integer>> graph = createAdjList(nums);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] vis = new boolean[nums.length];
        vis[0] = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int node = queue.poll();
                    if(node == nums.length - 1){
                        return min;
                    }
                for(int nbr : graph.get(node)){
                    if(!vis[nbr]){
                        vis[nbr] = true;
                        queue.add(nbr);
                    }
                }
            }
            min++;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {100,-23,-23,404,100,23,23,23,3,404};
        System.out.println(minJumps(nums));
    }

}
/***  Implicit BFS, creates neighbour only when required, optimised version of the above***/
class Solution {

    public static Map<Integer, ArrayList<Integer>> createAdjList(int[] nums ){
        Map<Integer, ArrayList<Integer>> indicesMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            if(!indicesMap.containsKey(a)){
                indicesMap.put(a, new ArrayList<>());
            }
            indicesMap.get(a).add(i);
        }
        return indicesMap;
    }
    public int minJumps(int[] nums) {
        int min = 0;
        if(nums.length == 1) return 0;
        Map<Integer, ArrayList<Integer>> indicesMap = createAdjList(nums);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        boolean[] vis = new boolean[nums.length];
        vis[0] = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int node = queue.poll();
                if(node == nums.length - 1){
                    return min;
                }
                if(node + 1 < nums.length && !vis[node + 1]){
                    vis[node + 1] = true;
                    queue.add(node + 1);
                }
                if(node - 1 >= 0 && !vis[node - 1]){
                    vis[node - 1] = true;
                    queue.add(node - 1);
                }
                for(int nbr : indicesMap.get(nums[node])){
                    if(!vis[nbr]){
                        vis[nbr] = true;
                        queue.add(nbr);
                    }
                }

                indicesMap.get(nums[node]).clear();
            }
            min++;
        }
        return -1;
    }
}
