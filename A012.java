import java.util.Arrays;

public class A012 {

    public int countPrimes(int n) {
        if(n==0||n==1) return 0;
        boolean[] list=new boolean[n+1];
        Arrays.fill(list,true);
        for(int i=2;i<Math.sqrt(n)+1;i++){
            if(list[i]){
                for(int j=i+i;j<n;j+=i){
                    list[j]=false;
                }
            }
        }
        int count=-3;
        for(boolean bool:list){
            if(bool) count++;
        }
        return count;
    }
}
