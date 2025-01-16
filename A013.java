import java.util.Arrays;

public class A013 {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length;i++){
            if(i<nums.length-2 && nums[i]==nums[i+1]) i++;
            else break;
        }
        return nums[i];
    }
}
