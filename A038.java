
public class A038 {

    public int mySqrt(int x) {
        if(x==0) return 0;
        long root=x;
        while(true){
            if(root>x/root) root/=2;
            else{
                while(x/root>root) root++;
                break;
            }
        }
        while(root*root>x) root--;
        return (int)root;
    }
}
