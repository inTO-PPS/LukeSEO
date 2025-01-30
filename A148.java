import java.util.Scanner;

public class A148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.trim();
        if(s.equals("")){
            System.out.println(0);
            return;
        }
        String[] ss=s.split(" ");
        System.out.println(ss.length);
    }
}
