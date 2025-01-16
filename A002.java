import java.util.ArrayList;
import java.util.List;

public class A002 {

    public List<List<Integer>> generate(int numRows) {
        if(numRows==1){
            List<Integer> list=new ArrayList<>();
            list.add(1);
            List<List<Integer>> listlist=new ArrayList<>();
            listlist.add(list);
            return listlist;
        }
        else{
            List<List<Integer>> list=generate(numRows-1);
            List<Integer> part=new ArrayList<>();
            for(int i=1;i<=numRows;i++){
                if(i==1){
                    part.add(1);
                }
                else if(i==numRows){
                    part.add(1);
                }
                else{
                    part.add(list.get(list.size()-1).get(i-2)+list.get(list.size()-1).get(i-1));
                }
            }
            list.add(part);
            return list;
        }
    }
}
