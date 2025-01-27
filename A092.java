public class A092 {
    public int[] sortArrayByParityII(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%2!=nums[i]%2){
                int j;
                for(j=i+1;j<nums.length;j++) if(nums[j]%2==i%2) break;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        return nums;
    }
}
