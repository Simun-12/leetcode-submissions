package slidingWindow;
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int[] freq = new int[26];
        int left = 0;
        int max = 0;
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch-'a']++;
            if(freq[ch-'a'] > 1) {
                freq[s.charAt(left)-'a']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
