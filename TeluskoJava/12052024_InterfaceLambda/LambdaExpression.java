// Lambda only used with functionalInterface
@FunctionalInterface
interface A {
    void show(String name);
}

public class LambdaExpression {
    public static void main(String[] args) {
        A a = (String name) -> {
            System.out.println(name + " is Implimenting show() method of interface A using LAMBDA Expression.");
        };
        a.show("bhupendra"); // OR
        A b = (name) -> {
            System.out.println(name + " is Implimenting show() method of interface A using LAMBDA Expression.");
        };
        b.show("Bhuvie");
        // OR
        A c = name -> {
            System.out.println(name + " is Implimenting show() method of interface A using LAMBDA Expression.");
        };
        c.show("akash");
    }
}
