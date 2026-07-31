package string;

import java.util.Arrays;
import java.util.Map;

public class MinNoPush2 {
    public int minimumPushes(String word) {
      int len = word.length();
      int[] arr = new int[26];
      int ans =0;
      int index=1;
      for(char ch: word.toCharArray()){
          arr[ch-'a']++;
      }
        Arrays.sort(arr);
      for(int i = arr.length-1; i>=0;){
          for(int j =i; j>=Math.max(0,i-8);j-- ){
              ans = ans + index*arr[j];
          }
          index++;
          i=i-8;
      }
      return ans;
    }
}
