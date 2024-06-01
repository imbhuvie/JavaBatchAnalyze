class Dimension {
    int w, h, d, ar;
    Dimension() {
        w = 2;
        h = 8;
        d = 6;

    }
    Dimension(int x, int y, int z) {
        w = x;
        h = y;
        d = z;
    }
    Dimension(Dimension D) {
        w = D.w;
        h = D.h;
        d = D.d;
    }

    void area() {
        ar = 2 * (w * h + h * d + d * w);
        System.out.println("Area =" + ar);
    }
}
public class RunDimension {
    public static void main(String[] args) {
        Dimension D1 = new Dimension();
        Dimension D2 = new Dimension(8, 5, 12);
        Dimension D3 = new Dimension(D1);
        D1.area();
        D2.area();
        D3.area();
    }
}