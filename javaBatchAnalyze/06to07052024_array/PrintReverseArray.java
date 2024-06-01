// WAP to input 10 element and print in reverse order

import java.util.Scanner;

public class PrintReverseArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array in reverse order :");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
        }
    }
}
