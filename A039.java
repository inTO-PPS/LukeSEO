
public class A039 {

    public boolean isPerfectSquare(int x) {
        if(x==0) return false;
        int root=x;
        while(true){
            if(root>x/root) root/=2;
            else{
                while(x/root>root) root++;
                break;
            }
        }
        while(root*root>x) root--;
        if(root*root==x) return true;
        else return false;
    }
}
