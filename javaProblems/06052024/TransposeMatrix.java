import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and column :");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        System.out.println("Enter the elements :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given Matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int b[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("Transpose of Matrix is :");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
