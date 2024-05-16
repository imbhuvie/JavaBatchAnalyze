// input m,n and find number nearest n which is divisible by m,

import java.util.Scanner;

public class ClosestToNDivisibleByM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m :");
        int m = sc.nextInt();// 6
        System.out.print("Enter n :");
        int n = sc.nextInt();// 16
        int j = 1;
        while (true) {
            if (n % m == 0) {
                System.out.println(n + " is the divisor themselves.");
                break;
            } else if ((n - j) % m == 0) {
                System.out.println((n - j) + " is closest(of " + n + ") divisor of " + m);
                break;
            } else if ((n + j) % m == 0) {
                System.out.println((n + j) + " is closest(of " + n + ") divisor of " + m);
                break;
            } else
                j++;
        }
    }
}

// APPROACH 2
class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m :");
        int m = sc.nextInt();// 7
        System.out.print("Enter n :");
        int n = sc.nextInt(); // 11
        int closest, rem;
        if (n % m == 0) {
            System.out.println(n + " is the divisor themselves.");
        } else {
            rem = n % m;
            if (rem <= (m / 2)) {
                closest = n - rem;
                System.out.println("Closest is :" + closest);
            } else {
                closest = n + (m - rem);
                System.out.println("Closest is :" + closest);

            }
        }
    }
}
