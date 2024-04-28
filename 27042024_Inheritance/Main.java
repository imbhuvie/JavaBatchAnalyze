// WAP to create class that series that have 3 attribute a,d,n it contains method input,
// now create 2 subclasses AP Series and GP series, to print respective series;

class InputClass {
    int a, d, n;

    void input(int a, int d, int n) {
        this.a = a;
        this.d = d;
        this.n = n;
    }

}

class APSeries extends InputClass {
    int term;

    void apSeries() {
        System.out.print("AP Series: ");
        for (int i = 0; i < n; i++) {
            term = (a + i * d);
            System.out.print(term + "\t");

        }
    }

}

class GPSeries extends InputClass {
    int t;

    void gpSeries() {
        System.out.print("\nGP Series: ");
        for (int i = 1; i <= n; i++) {
            t = (int) (a * Math.pow(d, i));
            System.out.print(t + "\t");

        }
    }
}

public class Main {
    public static void main(String[] args) {
        APSeries ap = new APSeries();
        ap.input(2, 5, 3);
        ap.apSeries();
        GPSeries gp = new GPSeries();
        gp.input(3, 6, 9);
        gp.gpSeries();
    }
}
