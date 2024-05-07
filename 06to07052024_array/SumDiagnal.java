// WAP to input matrix 4*4 and find 
//     1. sum of its left diagnal 
//     2. sum of its right diagnal

import java.util.Scanner;

public class SumDiagnal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter row and column :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a[][] = new int[x][y];
        System.out.println("\nEnter the Elements :");
        inputArray(a, x, y);
        System.out.println("\nGiven Array is :");
        outputArray(a, x, y);
        int sum = leftDiagnal(a, x, y);
        System.out.println("\nLeft diagnal sum :" + sum);
        sum = rightDiagnal(a, x, y);
        System.out.println("\nLeft diagnal sum :" + sum);
        sum = bothDiagnalSum(a, x, y);
        System.out.println("\nSum of both diagnal :" + sum);

    }

    static int bothDiagnalSum(int[][] a, int x, int y) {
        int sum = 0;
        System.out.print("\nDiagnal Elements are :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ((i + j) == (y - 1) || (i == j)) {
                    System.out.print(a[i][j] + " ");
                    sum += a[i][j];

                }

            }
        }
        return sum;
    }

    static int rightDiagnal(int[][] a, int x, int y) {
        int sum = 0;
        System.out.print("\nRight Diagnal are :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ((i + j) == (y - 1)) {
                    System.out.print(a[i][j] + " ");
                    sum += a[i][j];

                }

            }
        }
        return sum;
    }

    static int leftDiagnal(int[][] a, int x, int y) {
        int sum = 0;
        System.out.print("\nLeft Diagnal are :");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + " ");
                    sum += a[i][j];

                }

            }
        }
        return sum;
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
