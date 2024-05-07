// WAP to input 2 matrix 3*3 order and find its multiplication.
//Note 1:if matrix is M*N and X*Y then N==X is must else can't perform multiplication.
//Note 2:After multiplication new Matrix(row,column) will be column of first and second matrix i.e N*Y.
//Note 3:three loop i,j,k where condition will be i<X,j<Y,k<N||X .

import java.util.Scanner;

public class MultiplicationMatrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter first matirx row and column :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("Enter second matirx row and column :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (n != x) {
            System.out.println("Can't perform multiplication.");
            return;
        }
        int[][] a = new int[m][n];
        int[][] b = new int[x][y];
        System.out.println("Enter first matrix elements :");
        inputArray(a, m, n);
        System.out.println("Enter second matrix elements :");
        inputArray(b, x, y);
        System.out.println("First matrix is :");
        outputArray(a, m, n);
        System.out.println("Second matrix is :");
        outputArray(b, x, y);

        int c[][] = new int[n][y];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < y; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        System.out.println("Multiplicatio of both matrix is :");
        outputArray(c, m, y);
    }

    static void inputArray(int[][] a, int m, int n) {
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
