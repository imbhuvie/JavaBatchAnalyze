
class Value {
    int a, d, n;

    Value(int a) {
        this.a = a;
    }

    Value(int a, int d) {
        this(a);
        this.d = d;
    }

    Value(int a, int d, int n) {
        this(a, d);
        this.n = n;
    }

    void printAP() {
        System.out.print("AP series :");

        for (int i = 0; i < n; i++) {
            a = a + d;
            System.out.print(a + "\t");
        }
    }

}

public class APSeries {
    public static void main(String[] args) {
        Value v = new Value(4, 5, 8);
        v.printAP();

    }
}
