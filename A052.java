import java.util.Scanner;

public class A052 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        in.nextLine();
        int[] r=new int[x];
        for(int i=0;i<x;i++){
            String s=in.nextLine();
            int sum=0;
            int c=1;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='O'){
                    sum+=c;
                    c++;
                }
                else c=1;
            }
            r[i]=sum;
        }
        for(int p:r) System.out.println(p);
    }
}
