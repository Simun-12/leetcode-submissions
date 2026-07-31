package string;

public class SmallestPalindrome {
    public String smallestPalindrome(String s) {
       int[] freq = new int[26];
       StringBuilder ans = new StringBuilder();
       StringBuilder left = new StringBuilder();
       StringBuilder right = new StringBuilder();
       for(char ch: s.toCharArray()){
           freq[ch-'a']++;
       }
       String midElement = "";
       for(int i=0; i<26;i++){
           if(freq[i]%2 == 1) midElement = String.valueOf((char)(i + 'a'));;
           int leftFreq = freq[i]/2;
           while(leftFreq>0){
               left.append( String.valueOf((char)(i + 'a')));
               leftFreq--;
           }
       }
       ans.append(left);
       ans.append(midElement);
       right = left;
       ans.append(right.reverse());

       return ans.toString();
    }
}
