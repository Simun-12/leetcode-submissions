package arrays;

public class MaxBuildHeight {
    public static int maxBuilding(int n, int[][] restrictions) {
        if(restrictions == null) return n-1;
        return 0;
    }
    public static void main(String[] args){
     int[][]  restrictions = {{5,3},{2,5},{7,4},{10,3}};
     int n = 10;
        System.out.println(maxBuilding(n,restrictions));

    }
}
