import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int n, a = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows :");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j=0;j<=i;j++){
                System.out.print((a++)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}