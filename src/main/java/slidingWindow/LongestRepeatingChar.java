package slidingWindow;

public class LongestRepeatingChar {
    public static int characterReplacement(String s, int k) {
        int right,left=0;
        int count=0;
        int max=0;
        int[] freq = new int[26];
        for(right=0; right<s.length();right++){
            char ch = s.charAt(right);
            freq[ch-'A']++;
            count = Math.max( freq[ch-'A'],count);

            while ((right-left+1)-count>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            max = Math.max(right-left+1,max);
        }
        return max;
        }
}
