
public class A044 {

    public boolean checkRecord(String s) {
        int ac=0;
        int lc=0;
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i-1)=='L' && s.charAt(i)!='L' && lc<3) lc=0;
            if(s.charAt(i)=='A')ac++;
            else if(s.charAt(i)=='L') lc++;
        }
        return ac<2&&lc<3;
    }
}
