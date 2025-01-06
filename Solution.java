import java.util.*;

class Solution {

    //A001
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi=0;
        int count=0;
        for(int i:s){
            if(gi>=g.length)break;
            if(i>=g[gi]){
                count++;
                gi++;
            }
        }
        return count;
    }
}