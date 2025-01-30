import java.util.Arrays;

public class A146 {

    public int solution(int []A, int []B)
    {
        int sum=0;
        Arrays.sort(A);
        Arrays.sort(B);
        int i=0;
        int j=B.length-1;
        while(i<A.length){
            sum+=A[i]*B[j];
            i++;
            j--;
        }
        return sum;
    }

}
