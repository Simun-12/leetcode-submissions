package leetcodeDaily;

public class WeightedWordMapping {
    public static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(String s: words){
            int sum =0;
          for(int i =0; i<s.length(); i++){
              int index = s.charAt(i)- 'a';
              sum += weights[index];
          }
           sum = sum%26;
           sum = Math.abs((26-sum)%26);
           if(sum ==0) ans.append('z');
           else ans.append((char)('a' + sum-1));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[]  words = {"abcd","def","xyz"};
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words,weights));
    }
}
