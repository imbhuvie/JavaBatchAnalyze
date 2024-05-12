class A {
    void show() {
        System.out.println("SHOWING A");
    }
    void showA() {
        System.out.println("SHOWING showA");
    }
}

class B extends A {
    void show() {
        System.out.println("SHOWING B");
    }
    void showB() {
        System.out.println("SHOWING showB");
    }
}

class C extends A {
    void show() {
        showA();
        System.out.println("SHOWING C");
        showC();
    }
    void showC() {
        System.out.println("SHOWING showC");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a = new B();
        a.show();
        a = new C();
        a.show();
        C c = new C();
        c.show();

    }
}
