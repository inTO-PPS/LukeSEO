/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 *
 */
public class A119 {
    public int guessNumber(int n) {
        //return qwer(0,n+1);
        int l=1;
        int r=n;
        int mid=0;
        while(true){
            mid=l+(r-l)/2;
            int p=guess(mid);
            if(p==0) return mid;
            else if(p==1) l=mid;
            else r=mid;
        }
    }

    int qwer(int l,int h){
        int x=l+(h-l)/2;
        int p=guess(x);
        if(p==1) return qwer(x,h);
        else if(p==-1) return qwer(l,x);
        else return x;
    }

    int guess(int x){
        return 0;
    }
}
