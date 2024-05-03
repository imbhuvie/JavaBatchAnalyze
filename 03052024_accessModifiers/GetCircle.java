import java.util.Scanner;

class Circle {
    static int radius;

    static void areaCircle() {
        double area = Math.PI * radius * radius;
        System.out.println("Area :" + area);
    }

    static void circumference() {
        double cir = 2 * Math.PI * radius;
        System.out.println("Circumference :" + cir);
    }

}

public class GetCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius :");
        Circle.radius = sc.nextInt();
        Circle.areaCircle();
        Circle.circumference();
    }
}