// Lambda only used with functionalInterface
@FunctionalInterface
interface A {
    int sum(int i, int j);
}

public class LambdaDemo {
    public static void main(String[] args) {
        A a = (i, j) -> (i + j);
        System.out.println(a.sum(2, 4));
        // OR
        A a1 = new A() {
            public int sum(int i, int j) {
                return i + j;
            }
        };
        System.out.println(a.sum(8, 4));

    }
}
