package leetcodeDaily;

public class AngleBwClock {
    public static double angleClock(int hour, int minutes) {
        double ans =0.0;
        double unitangle = (double) 360/60;
        double hourPos = (double) (minutes)*5/60 + (hour%12)*5;
        double minute = hourPos - minutes;
        ans = unitangle*minute;
        return Math.min(ans,360-ans);
    }
    public static void main(String[] args){
        int hour = 12,minutes = 30;
        System.out.println(angleClock(hour,minutes));
    }

}
