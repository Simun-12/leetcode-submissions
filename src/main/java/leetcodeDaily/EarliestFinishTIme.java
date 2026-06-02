package leetcodeDaily;

public class EarliestFinishTIme {
    public static int getMin(int[] a, int[] b){
        int min = Integer.MAX_VALUE ;
        for(int i=0; i<a.length; i++){
            min = Math.min(min, a[i]+b[i]);
        }
        return min;
    }
    public static int earliestFinishTime(int[] landStartTime,int[] landDuration,int[] waterStartTime,int[] waterDuration) {
        int minLand = getMin(landStartTime, landDuration);
        int minWater = getMin(waterStartTime, waterDuration);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            ans = Math.min(ans,Math.max(minLand, waterStartTime[i]) + waterDuration[i]
            );
        }
        for (int i = 0; i < landStartTime.length; i++) {
            ans = Math.min(ans, Math.max(minWater, landStartTime[i]) + landDuration[i]
            );
        }
        return ans;
    }
    public static void main(String[] args){
        int[] landStartTime = {2,8}, landDuration = {4,1}, waterStartTime = {6}, waterDuration = {3};
        System.out.println(earliestFinishTime(landStartTime,landDuration,waterStartTime,waterDuration));
    }
}
