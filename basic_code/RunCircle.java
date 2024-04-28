class Circle {
    double r, ar, cr;

    void getRadius(double r) {
        this.r = r;
    }

    void areaCircle() {
        ar = Math.PI * Math.pow(r, 2);
        System.out.println("Area :" + ar);
    }

    void circumferenceCircle() {
        cr = 2 * Math.PI * r;
        System.out.println("Circumference :" + cr);
    }
}

public class RunCircle {
    public static void main(String[] args) {
        Circle ob = new Circle();
        ob.getRadius(5.8);
        ob.areaCircle();
        ob.circumferenceCircle();
    }
}