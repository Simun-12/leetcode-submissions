package leetcodeDaily;

public class ProcessStringSplOps {

    public static void duplicate(StringBuilder res){
        res.append(res.toString());
    }
    public static StringBuilder reverse(StringBuilder res){
        return new StringBuilder(res).reverse();
    }
    public static StringBuilder processStr(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                result.append(ch);
            }
            else if(ch == '*') {
                if(result.length() > 0)
                    result.deleteCharAt(result.length() - 1);
            }
            else if(ch == '#') {
                duplicate(result);
            }
            else if(ch == '%') {
                result = reverse(result);
            }
        }
        return result;
    }
    public static void main(String[] args){
        String s = "a#b%*";
        System.out.println(processStr(s));
    }
}