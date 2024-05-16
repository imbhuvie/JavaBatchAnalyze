import java.util.Scanner;

public class LargestIn3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > b)
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);
        scanner.close();
    }
}
