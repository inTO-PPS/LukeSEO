import java.util.ArrayList;
import java.util.List;

public class A037 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDividing(i)) list.add(i);
        }
        return list;
    }
    boolean selfDividing(int num){
        int div=10;
        int digit;
        while(true){
            digit=num%div/(div/10);
            if(digit==0) return false;
            if(num%digit!=0) return false;
            div*=10;
            if(div>num*10) break;
        }
        return true;
    }
}
