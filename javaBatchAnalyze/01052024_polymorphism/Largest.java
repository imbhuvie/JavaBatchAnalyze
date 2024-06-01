import java.util.Scanner;

class Number {
    void largest(int a, int b) {
        if (a == b)
            System.out.println("Both are same");
        else if (a > b)
            System.out.println(a + " is greatest");
        else
            System.out.println(b + " is greatest");
    }

    void largest(int a, int b, int c) {
        if (a > b) {
            if (a > c)
                System.out.println(a + " is greates");
            else
                System.out.println(c + " is greatest");
        }

        else if (b > c)
            System.out.println(b + " is greatest");
        else
            System.out.println(c + " is greatest");
    }
}

public class Largest {
    public static void main(String[] args) {
        Number obj = new Number();
        obj.largest(68, 88);
        obj.largest(104, 99, 87);
    }
}
