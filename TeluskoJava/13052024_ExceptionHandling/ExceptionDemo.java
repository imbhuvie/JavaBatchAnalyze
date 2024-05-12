
public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 78;
        int j = 79;
        try {
            i = i / j;
            if (i == 0)
                throw new ArithmeticException("value of i was zero");
        } catch (ArithmeticException e) { // we can also use Exception instead of ArithmeticException
            i = 1;
            System.out.println("Default value printing " + e);
        }
        System.out.println(i);
        System.out.println("Hello Java!");

    }
}
