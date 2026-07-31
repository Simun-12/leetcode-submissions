package leetcodeDaily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 0;
        for(int num:arr2){
            if(!map.containsKey(num)){
                map.put(num,++rank);
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
}
