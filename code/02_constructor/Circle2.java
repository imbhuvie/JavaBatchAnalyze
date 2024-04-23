import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle2 {
    double r;
    DecimalFormat df = new DecimalFormat("#.###");

    Circle2() {
        System.out.print("Enter the Radius of Circle : ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
    }

    void calArea() {
        double area = Math.PI * r * r;
        System.out.printf("Area of Circle :" + df.format(area));
    }

    void calCircum() {
        double circum = 2 * Math.PI * r;
        System.out.println("\nCircumference of Circle :" + df.format(circum));  
    }

    public static void main(String[] args) {
        // System.out.println("Hello Java!");
        Circle2 c = new Circle2();
        c.calArea();
        c.calCircum();
    }
}
