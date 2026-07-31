package string;

public class MinNoPush1 {
    public int minimumPushes(String word) {
     int length = word.length();
     int ans =0;
     if(length<=8) return length;
     else{
       int remainingChar = length%8;
       int chunk = length/8;
       ans =  8*((chunk*(chunk+1))/2) + remainingChar*(chunk+1);
       }
     return ans;
    }
}

