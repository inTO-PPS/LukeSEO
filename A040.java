
public class A040 {

    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2).toLowerCase();
        String b=s.substring(s.length()/2).toLowerCase();
        int ac=0;
        int bc=0;
        String[] list={"a","e","i","o","u"};
        for(String vowel:list){
            while(a.contains(vowel)){
                a=a.replaceFirst(vowel,"");
                ac++;
            }
            while(b.contains(vowel)){
                b=b.replaceFirst(vowel,"");
                bc++;
            }
        }
        return ac==bc;
    }
}
