package string;

import static java.lang.Math.abs;

public class CountSpecialCharacters {
    public static int numberOfSpecialChars(String word) {

        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') lower[c - 'a'] = true;
            else if (c >= 'A' && c <= 'Z') upper[c - 'A'] = true;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i]) ans++;
        }

        return ans;
    }
    public static void main(String[] args){
        String word = "aaAbcBC";
        System.out.println(numberOfSpecialChars((word)));
    }
}
