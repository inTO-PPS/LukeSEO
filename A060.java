import java.util.ArrayList;
import java.util.List;

public class A060 {

    public int calPoints(String[] operations) {
        List<Integer> record=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            switch(operations[i]){
                case "C":
                    record.remove(record.size()-1);
                    break;
                case "D":
                    record.add(record.get(record.size()-1)*2);
                    break;
                case "+":
                    record.add(record.get(record.size()-1)+record.get(record.size()-2));
                    break;
                default:
                    record.add(Integer.valueOf(operations[i]));
                    break;
            }
        }
        int result=0;
        for(int i:record) result+=i;
        return result;
    }

}
