// WAP to check Number is SelfDivisible or not as 24: 2,4 both can devide 24
// or 36 : 3,6 both can divide 36, something like that

import java.util.Scanner;

public class SelfDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        Integer x = sc.nextInt();
        boolean flag = true;
        int temp = x;
        while (temp > 0) {
            int r = temp % 10;
            if (x % r != 0) {
                flag = false;
                break;
            }
            temp /= 10;
        }
        if (flag) {
            System.out.println("self Divisible");
        } else {
            System.out.println("Not Self Devisible.");
        }
    }
}