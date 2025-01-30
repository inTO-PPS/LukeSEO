import java.util.Scanner;

public class A190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(l==n && n==m) System.out.println(10000+l*1000);
        else if(n==m || n==l) System.out.println(1000+n*100);
        else if(l==m) System.out.println(1000+m*100);
        else System.out.println(Math.max(Math.max(l,n),m)*100);

    }
}
