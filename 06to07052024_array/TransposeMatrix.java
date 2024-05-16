//Transpose of Matrix in java

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and column :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter Elements :");
        inputArray(a, m, n);
        System.out.println("Given Matrix is :");
        outputArray(a, m, n);
        int b[][] = new int[n][m];
        // Transpose of matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("Transpose of matrix is :");
        outputArray(b, n, m);
    }

    static void inputArray(int[][] a, int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void outputArray(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
