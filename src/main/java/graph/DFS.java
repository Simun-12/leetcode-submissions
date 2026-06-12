package graph;

import java.util.*;

public class DFS {
    public static void dfs(int node,Map<Integer, ArrayList<Integer>> graph,int[] visited, ArrayList<Integer> values ){
        if(visited[node]== 1) return;
        visited[node] = 1;
        values.add(node);
        for(int nbr :graph.get(node)){
            if(visited[nbr] != 1)
                dfs(nbr,graph,visited,values);
        }
    }
    public static Map<Integer, ArrayList<Integer>> createAdjList( int[][] edges){
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        for(int[] edge: edges){
            int a= edge[0];
            int b= edge[1];
            if(!graph.containsKey(a)){
                graph.put(a,new ArrayList<>());
            }
            graph.get(a).add(b);
            if(!graph.containsKey(b)){
                graph.put(b, new ArrayList<>());
            }
            graph.get(b).add(a);
        }

      return graph;
    }

    public static int getVertexCnt(int[][] edges){
        Set<Integer> vertex = new HashSet<>();
        for(int[] edge: edges){
            vertex.add(edge[0]);
            vertex.add(edge[1]);
        }
        return vertex.size();
    }


    public static void main(String[] args){
        int[][] edges= {
            {0,1},
            {1,4},
            {1,2},
            {2,3}
        };

        Map<Integer, ArrayList<Integer>> graph = createAdjList(edges);
        int vertices = getVertexCnt(edges);
        int[] visited = new int[vertices+1];
        Arrays.fill(visited,-1);
        ArrayList <Integer> nums = new ArrayList<>();

        dfs(0, graph, visited, nums);

        for(int num: nums){
            System.out.print(num+ " ");
        }


    }
}
