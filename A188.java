import java.util.Scanner;

public class A188 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        if(a>0 && b>0) System.out.print("1");
        else if(a<0 && b<0) System.out.print("3");
        else if(a>0) System.out.print("4");
        else System.out.print("2");
    }
}
