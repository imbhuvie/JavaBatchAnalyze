// WAP to merge to array in same order.

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];
        System.out.print("Enter 10 element for array 1 :");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter 10 element for array 2 :");
        for (int i = 0; i < 10; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < 10; i++) {
            c[i + 10] = b[i];
        }
        for (int k : c)
            System.out.print(k + " ");

        // OR using method
        System.arraycopy(a, 0, c, 0, 10);
        System.arraycopy(b, 0, c, 10, 10);
        for (int k : c)
            System.out.print(k + " ");
    }
}