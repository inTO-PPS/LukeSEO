
public class A055 {

    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder(s);
        int flag=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(flag==0){
                str.deleteCharAt(i);
                i--;
                flag=1;
            }
            else if(count<0){
                str.deleteCharAt(i-1);
                if(i==str.length()) break;
                i-=2;
                flag=0;
                count=0;
            }
            else{
                if(str.charAt(i)=='(') count++;
                else count--;
            }
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}
