
class Table {
    int n;

    Table() {
        n = 6;
    }

    Table(int x) {
        n = x;
    }

    Table(Table T) {
        n = T.n;
    }

    void printTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + n);
        }
        System.out.println("-------------------------------------------");
    }
}

public class ConstructorOverloading1 {
    public static void main(String[] args) {
        Table t = new Table();
        Table t0 = new Table(6);
        Table t1 = new Table(t0);
        t.printTable();
        t0.printTable();
        t1.printTable();
    }
}