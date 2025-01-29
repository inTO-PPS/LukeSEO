import java.util.Scanner;

public class A008 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        double[] r=new double[x];
        for(int i=0;i<x;i++){
            int y=in.nextInt();
            int[] n=new int[y];
            int sum=0;
            for(int j=0;j<y;j++){
                n[j]=in.nextInt();
                sum+=n[j];
            }
            double avg=sum/(double)y;
            int c=0;
            for(int j=0;j<y;j++) if(n[j]>avg) c++;

            r[i]=(double)c/y*100;
        }
        for(double d:r) System.out.printf("%.3f%%\n",d);
    }
}
