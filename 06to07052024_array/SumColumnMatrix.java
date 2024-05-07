import java.util.Scanner;

public class SumColumnMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];

        System.out.println("Enter First Mratrix element :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nSum of Rows :");
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += a[i][j];
            }
            System.out.println("sum of row " + i + " is :" + sum);
            sum = 0;
        }

        System.out.println("\nSum of Columns :");
        sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += a[j][i];
            }
            System.out.println("sum of column " + i + " is :" + sum);
            sum = 0;
        }
    }
}
