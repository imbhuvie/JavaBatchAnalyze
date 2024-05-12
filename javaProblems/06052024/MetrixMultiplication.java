import java.util.Scanner;

public class MetrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter row and column for first metrics :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.print("ENter row and column for second metrics :");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] b = new int[p][q];
        if (m != q) {
            System.out.println("Can't Make Multiplication.");
            return;
        }
        System.out.println("Enter Element for first metrics :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Element for Second metrics :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("first metrics :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second metrics :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println();
        }
        int[][] c = new int[m][q];
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
                sum = 0;
            }
        }
        System.out.println("Result metrics :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }
    }
}
