package reccursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNum {

    private static void helper(List<String> ans, String digits, int index, String curr, Map<Character, String> map) {
        if(index == digits.length()) {
            ans.add(curr);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i = 0; i < letters.length(); i++) {
            helper(ans, digits, index + 1, curr + letters.charAt(i), map);
        }
    }
    public static List<String> letterCombinations(String digits) {
        Map<Character,String> map = new HashMap<>();
        map.put('1', "xyz");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()) return ans;
        helper(ans, digits, 0, "", map);
        return ans;
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}