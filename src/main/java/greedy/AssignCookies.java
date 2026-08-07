package greedy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int content =0;
        for(int i=0, j=0; i<s.length;i++){
            if(j<g.length && s[i]>=g[j]){
                content++;
                j++;
            }
        }
        return content;
    }
}
