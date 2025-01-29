import java.util.ArrayList;
import java.util.List;

public class A103 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        List<String> list=new ArrayList<>();
        for(String word:words){
            String x="";
            for(int i=0;i<word.length();i++){
                x+=morse[word.charAt(i)-'a'];
            }
            if(!list.contains(x)) list.add(x);
        }
        return list.size();
    }
}
