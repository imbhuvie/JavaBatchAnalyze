// WAP of an array of 10 element and find frequency of specific number.

import java.util.Scanner;

public class FrequencyEachNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 Elements :");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            int count = 1;
            if (a[i] != 0) {
                for (int j = i + 1; j < 10; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = 0;
                    }

                }
                System.out.println("Frequency of " + a[i] + " is :" + count);
            }
        }
        // OR second option

        // for (int i = 0; i < 10; i++) {
        // int value = 1;
        // for (int j = i+1; j < 10; j++) {
        // if (a[i] == a[j]) {
        // value++;
        // a[j] = 0;
        // }
        // }
        // if (a[i] != 0)
        // System.out.println("Frequency of " + a[i] + " is :" + value);
        // }
        sc.close();
    }

}
