import java.util.Arrays;

public class A090 {
    public int removeDuplicates(int[] nums) {
        int x=99999;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=x) x=nums[i];
            else nums[i]=99999;
        }
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==99999) break;
        }
        return i;
    }
}
