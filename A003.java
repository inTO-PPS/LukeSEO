
public class A003 {

    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        for(int i=digits.length-1;i>0;i--){
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1]++;
            }
        }
        if(digits[0]==10){
            int[] newDigits=new int[digits.length+1];
            newDigits[0]=1;
            newDigits[1]=0;
            for(int i=1;i<digits.length;i++){
                newDigits[i+1]=digits[i];
            }
            return newDigits;
        }
        return digits;
    }
}
