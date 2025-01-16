
public class A025 {

    public boolean isPowerOfFour(int n) {
        int div=0;
        while(true){
            if(Math.pow(4,div)==n) return true;
            div++;
            if(Math.pow(4,div)>n) break;
        }
        return false;
    }
}
