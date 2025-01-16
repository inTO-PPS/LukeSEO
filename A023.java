
public class A023 {

    public int addDigits(int num) {
        if(num<10) return num;
        int sum=0;
        long div=10;
        while(true){
            long digit=num%div/(div/10);
            sum+=digit;
            if(num/div<1) break;
            div*=10;
        }
        return addDigits(sum);
    }
}
