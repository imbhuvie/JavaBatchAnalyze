//WAP to input 2 matrices 3*4 order and find its additon.

import java.util.Scanner;

public class AddMratrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column matrix :");
        int m = sc.nextInt();
        int[][] a = new int[m][m];
        int[][] b = new int[m][m];

        System.out.print("Enter First Mratrix element :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Second Mratrix element :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 :");
        for (int i = 0; i < m; i++) {
            // System.out.print(i + " row element :");
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int i = 0; i < m; i++) {
            // System.out.print(i + " row element :");

            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        int c[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of Matrix 1 and Matrix 2:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

}
