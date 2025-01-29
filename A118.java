public class A118 {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-count;i++){
            if(nums[i]==0 && i+count<nums.length){
                int j=i;
                for(j=i;j<nums.length-count-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[j]=0;
                count++;
                i--;
            }
        }
    }
}
