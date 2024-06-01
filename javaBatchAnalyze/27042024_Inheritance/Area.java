// WAP to create a class Shape that contains 2 child and input for input and now create 2 subclasses
// rectangle and tringle to compute respective areas.
class Shape {
    int a, b;

    void getInput(int a, int b) {
        this.a = a;
        this.b = b;
    }

}

class Rectangle extends Shape {
    int area;

    void areaRectangle() {
        area = a * b;
        System.out.println("Area of Rec :" + area);
    }
}

class Tringle extends Shape {
    double area;

    void areaTringle() {
        area = 0.5 * a * b;
        System.out.println("Area of Tringle :" + area);
    }
}
public class Area{
    public static void main(String[] args) {
        Rectangle R=new Rectangle();
        R.getInput(30,45);
        R.areaRectangle();
        Tringle T=new Tringle();
        T.getInput(24, 45);
        T.areaTringle();
    }
}