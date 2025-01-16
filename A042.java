
public class A042 {

    public boolean backspaceCompare(String s, String t) {
        for(int i=0;i<s.length();i++){
            if(i!=0 && s.charAt(i)=='#'){
                s=s.replace(s.substring(i-1,i+1),"");
                i-=2;
            }
            else if(i==0 && s.charAt(i)=='#'){
                s=s.replaceFirst("#","");
                i--;
            }
        }
        for(int i=0;i<t.length();i++){
            if(i!=0 && t.charAt(i)=='#'){
                t=t.replace(t.substring(i-1,i+1),"");
                i-=2;
            }
            else if(i==0 && t.charAt(i)=='#'){
                t=t.replaceFirst("#","");
                i--;
            }
        }
        return s.equals(t);
    }
}
