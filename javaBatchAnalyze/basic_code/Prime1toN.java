import java.util.Scanner;

public class Prime1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        System.out.print("Prime num between 1 to " + n + " :");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
    private static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}