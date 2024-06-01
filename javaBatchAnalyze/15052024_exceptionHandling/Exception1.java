
public class Exception1 {
    public static void main(String[] args) {
        int a, b, res;
        a = 20;
        b = 0;
        try {
            res = a + b;
            System.out.println("Addition :" + res);
            res = a - b;
            System.out.println("Subtraction :" + res);
            res = a / b;
            System.out.println("Devision :" + res);
        } finally {
            System.out.println("hello java!");
            res = a * b;
            System.out.println("Multiplication :" + res);
            System.out.println("End of program.");
        }

    }
}
