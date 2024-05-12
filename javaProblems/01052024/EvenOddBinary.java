import java.util.Scanner;

public class EvenOddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String n = Integer.toBinaryString(num);
        // System.out.println(n);
        num = Integer.parseInt(n);
        if ((num & 1) == 1)
            System.out.println("odd");
        else
            System.out.println("Even");

        sc.close();
    }
}
