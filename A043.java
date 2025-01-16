
public class A043 {

    public String longestCommonPrefix(String[] strs) {
        String first=strs[0];
        int i;
        int flag=0;
        for(i=0;i<first.length();i++){
            for(String str:strs){
                if(i<str.length() && str.charAt(i)==first.charAt(i)){
                    continue;
                }
                else{
                    flag=1;
                    break;
                }
            }
            if(flag==1) break;
        }
        return first.substring(0,i);
    }
}
