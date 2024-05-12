class A {
    void show() {
        System.out.println("show method in A class.");
    }
}
abstract class B {
    abstract void show();

    void display() {
        System.out.println("In Class B Display() method.");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A a = new A() {
            void show() {
                show();
                System.out.println("show method in inner class of Class A.");
            }
        };
        a.show(); // inner class code will execute not class code
        B b = new B() {
            void show() {
                System.out.println("show() method in inner class of Class B");
            }
        };
        b.show();
        b.display();
    }

}
