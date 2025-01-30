public class A171 {
    public int solution(int a, int b, int n) {
        if(n<a) return 0;
        return n%a==0?n/a*b+solution(a,b,n/a*b):n/a*b+solution(a,b,n/a*b+n%a);
    }
}
