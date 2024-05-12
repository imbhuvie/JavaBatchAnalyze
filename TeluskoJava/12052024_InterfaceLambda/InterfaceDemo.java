

interface A {
    void show1();

    void show2();

    void show3();
}

@FunctionalInterface
interface B { // it is a functionalInterface so we can impliment in innerClass Also.
    void show4();
}

class D {
    void show1() {
        System.out.println("show1 in D class");
    }
}

class C extends D implements A, B {
    public void show4() {
        System.out.println("show4");
    }

    public void show1() {
        super.show1();
        System.out.println("show1");
    }

    public void show2() {
        System.out.println("show2");
    }

    public void show3() {
        System.out.println("show3");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        C c = new C();
        c.show1();
        c.show2();
        c.show3();
        c.show4();
        B b = new B() {
            @Override
            public void show4() {
                // TODO Auto-generated method stub
                System.out.println("show4 method implimentation in innerClass,of Interface B");
            }

        }; //this can be code using lambda expression.
        b.show4();

    }
}
