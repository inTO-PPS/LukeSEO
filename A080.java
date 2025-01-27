public class A080 {
    //Moore's Voting Algorithm 공부 필요
    public int majorityElement(int[] nums) {
        int el=0;
        int c=0;
        for(int num:nums){
            if(c==0){
                el=num;
                c++;
            }
            else if(num==el){
                c++;
            }
            else c--;
        }
        return el;
    }
}
