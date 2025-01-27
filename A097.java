public class A097 {
    //two pointer 접근법!! mind-blowing OMG!!!
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(true){
            if(numbers[i]+numbers[j]>target){
                j--;
            }
            else if(numbers[i]+numbers[j]<target){
                i++;
            }
            else break;
        }
        int[] re={i+1,j+1};
        return re;
    }
}
