public class A122 {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            s+=s.charAt(0);
            s=s.substring(1);
            if(s.equals(goal)) return true;
        }
        return false;
    }
}
