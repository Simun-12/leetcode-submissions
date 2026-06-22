package leetcodeDaily;

public class MaxNoBalloons {
    public static int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(int i =0; i<text.length(); i++){
            freq[text.charAt(i)-'a']++;
        }
        int min=Integer.MAX_VALUE;
        String word = "balloon";
        for(int i=0; i<word.length();i++){
            char ch = word.charAt(i);
            if(ch == 'l' || ch == 'o')
                min = Math.min(min, freq[ch - 'a'] / 2);
            else
                min = Math.min(min, freq[ch - 'a']);
        }
        return min;
    }
    public int countWords(String text, String word) {
        int[] freq = new int[26];
        int[] count = new int[26];
        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : word.toCharArray()) {
            count[ch - 'a']++;
        }
        int min = Integer.MAX_VALUE;
        for (char ch : word.toCharArray()) {
            if (count[ch - 'a'] > 0) {
                min = Math.min(min, freq[ch - 'a'] / count[ch - 'a']);
                count[ch - 'a'] = 0;
            }
        }
        return min;
    }
    public static void main(String[] args){
        String text = "nlaebolkoballoonball";
        System.out.println(maxNumberOfBalloons(text));
    }
}


