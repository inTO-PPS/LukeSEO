import java.util.Scanner;

public class A197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) list[i] = i+1;
        int M = sc.nextInt();
        int[][] arr = new int[M][2];
        for (int i = 0; i < M; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int[] i:arr){
            int temp = list[i[0]-1];
            list[i[0]-1] = list[i[1]-1];
            list[i[1]-1] = temp;
        }
        for (int i = 0; i < N; i++) System.out.print(list[i]+" ");
    }
}
