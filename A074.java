public class A074 {
    public boolean isPalindrome(String s) {
        String x="";
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i))) x+=s.charAt(i);
        }
        x=x.toUpperCase();
        int j=x.length()-1;
        for(int i=0;i<x.length()/2;i++){
            if(x.charAt(i)!=x.charAt(j)) return false;
            j--;
        }
        return true;
    }
}
