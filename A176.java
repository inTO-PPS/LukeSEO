public class A176 {
    public int solution(int n) {
        int an = 1;
        while(n%an!=1) an++;
        return an;
    }
}
