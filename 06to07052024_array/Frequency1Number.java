// WAP of an array of 10 element and find frequency of specific number.

import java.util.Scanner;

public class Frequency1Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 Elements :");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Element :");
        int num = sc.nextInt();
        int count = 0;
        for (int n : a) {
            if (n == num)
                count++;
        }
        System.out.println("Frequncy of " + num + " is :" + count);

    }
}
