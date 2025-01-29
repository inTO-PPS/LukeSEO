public class A120 {
    public char findTheDifference(String s, String t) {
        int[] c1=new int[26];
        int[] c2=new int[26];
        for(int i=0;i<26;i++){
            c1[i]=0;
            c2[i]=0;
        }
        for(int i=0;i<s.length();i++){
            c1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            c2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(c1[i]!=c2[i]) return (char)(i+97);
        }
        return 0;
    }
}
