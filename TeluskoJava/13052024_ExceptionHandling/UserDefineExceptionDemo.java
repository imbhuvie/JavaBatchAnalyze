import java.util.Scanner;

class UserDefineException extends Exception {
    UserDefineException(String msg) {
        super(msg);
    }
}

public class UserDefineExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        try {
            a /= b;
            if (a == 0)
                throw new UserDefineException("he value of a become zero");

        } catch (UserDefineException e) {
            a = 1;
            System.out.println("default value is printing using :" + e);
        }
        System.out.println("Value of A :" + a);

    }
}
