// WAP to create a Class Series that contains three attributes a,d,n and
// two method getData and printSeries
// Now create two subClasses APSeries and GPSeries to print respective series by overriding printSeries() method

class Series {
    int a, d, n;

    void getData(int x, int y, int z) {
        a = x;
        d = y;
        n = z;
    }

    void printSeries() {
        System.out.println("You can print series.");
    }
}

class APSeries extends Series {
    int t;

    void printSeries() {
        System.out.print("AP Series :");
        for (int i = 0; i < n; i++) {
            t = a + (d * i);
            System.out.print(t + " ");
        }
    }
}

class GPSeries extends Series {
    int t;

    void printSeries() {
        System.out.print("\nGP Series :");
        for (int i = 0; i < n; i++) {
            t = (int) (a * (Math.pow(d, i)));
            System.out.print(t + " ");
        }
    }
}

public class RunSeries {
    public static void main(String[] args) {
        APSeries ap = new APSeries();
        GPSeries gp = new GPSeries();
        ap.getData(10, 5, 10);
        gp.getData(2, 3, 10);
        ap.printSeries();
        gp.printSeries();
    }
}