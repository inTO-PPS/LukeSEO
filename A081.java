import java.util.Arrays;
import java.util.Scanner;

public class A081 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int[][] n=new int[a][10];
        for(int i=0;i<a;i++){
            for(int j=0;j<10;j++){
                n[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            Arrays.sort(n[i]);
            System.out.println(n[i][7]);
        }

    }
}
