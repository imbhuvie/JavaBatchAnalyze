//array of n-1 and input 1 to n-1 random number then find missing 1 number between 1 to n.

import java.util.Scanner;

public class MissingNumBetween1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N :");
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        System.out.println("Enter the number between 1 to N :");
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }
        int missingNumber = n * (n + 1) / 2;
        for (int i = 0; i < n - 1; i++) {
            missingNumber -= a[i];
        }
        System.out.println("Missing Number is :" + missingNumber);
    }
}

// OR second Approch without using second loop.
class MissingNumBetween1toNSecondApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N :");
        int n = sc.nextInt();
        int missingNumber = n * (n + 1) / 2;
        int[] a = new int[n - 1];
        System.out.println("Enter the number between 1 to N :");
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
            missingNumber -= a[i];
        }

        System.out.println("Missing Number is :" + missingNumber);
    }
}