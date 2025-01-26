import java.util.Arrays;

public class A064 {
    public int heightChecker(int[] heights) {
        int[] list=heights.clone();
        Arrays.sort(list);
        int c=0;
        for(int i=0;i<list.length;i++){
            if(list[i]!=heights[i]) c++;
        }
        return c;
    }
}
