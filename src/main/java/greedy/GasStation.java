package greedy;

import static java.lang.Math.abs;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
     int ans = -1;
     int index = 0;
     int maxgain = Integer.MIN_VALUE;
     for(int i =0; i<gas.length; i++){
        int gain = gas[i]- cost[i];
        if(gain>maxgain){
            maxgain = gain;
            index = i;
        }
     }

     return index;
    }
    public static void main(String[] args){
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int ans = canCompleteCircuit(gas , cost);
        System.out.println(ans);
    }
}
