import java.util.Arrays;

public class A091 {
    public int removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) nums[i]=99999;
        }
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==99999) break;
        }
        return i;

    }
}
