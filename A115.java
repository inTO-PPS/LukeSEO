public class A115 {
    public int maxNumberOfBalloons(String text) {
        int[] x=new int[5];
        for(int i=0;i<text.length();i++){
            switch(text.charAt(i)){
                case 'b': x[0]++; break;
                case 'a': x[1]++; break;
                case 'l': x[2]++; break;
                case 'o': x[3]++; break;
                case 'n': x[4]++; break;
            }
        }
        x[2]/=2;
        x[3]/=2;
        int re=0;
        for(int i=0;i<x.length;i++){
            if(x[i]==0) return 0;
            if(x[re]>x[i]) re=i;
        }
        return x[re];
    }
}
