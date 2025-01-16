import java.util.ArrayList;
import java.util.List;

public class A014 {

    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String str="";
            if(i<nums.length-1 && nums[i+1]==nums[i]+1){
                str+=nums[i]+"->";
                int j;
                for(j=i+1;j<nums.length;j++){
                    if(!(j<nums.length-1 && nums[j]+1==nums[j+1])) break;
                }
                str+=nums[j];
                list.add(str);
                i=j;
            }
            else if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            else{
                str+=nums[i];
                list.add(str);
            }
        }
        return list;
    }
}
