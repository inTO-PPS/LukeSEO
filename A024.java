import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A024 {

    public boolean lemonadeChange(int[] bills) {
        List<Integer> list=new ArrayList<>();

        for(int i:bills){
            switch(i){
                case 5:
                    list.add(5);
                    break;
                case 10:
                    if(list.contains(5)){
                        list.remove(Integer.valueOf(5));
                        list.add(10);
                    }
                    else return false;
                    break;
                case 20:
                    if(list.contains(5) && list.contains(10)){
                        list.remove(Integer.valueOf(5));
                        list.remove(Integer.valueOf(10));
                    }
                    else if(Collections.frequency(list,5)>=3){
                        for(int j=0;j<3;j++) list.remove(Integer.valueOf(5));
                    }
                    else return false;
                    break;
            }
        }
        return true;
    }
}
