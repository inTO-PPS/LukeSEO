public class A067 {
    public String removeDuplicates(String s) {
        StringBuilder ss=new StringBuilder(s);
        for(int i=0;i<ss.length();i++){
            if(i<ss.length()-1 && ss.charAt(i)==ss.charAt(i+1)){
                ss.delete(i,i+2);
                if(i>0)i-=2;
                else i=-1;
            }
        }
        return ss.toString();
    }
}
