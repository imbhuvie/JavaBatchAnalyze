class A {
    void show() throws ClassNotFoundException {
        Class.forName("Demo");
    }
}

class B {
    void showB() throws ClassNotFoundException {
        A a = new A();
        a.show();
    }
}

public class ThrowsDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        B b = new B();
        b.showB();
    }
}
// Here we are passing exception one method of class to another method of class
// which is calling that method and so on this is called ducking and at end it
// goes to main() method, this is not good practice at end at main() method it
// should be must handled by try and catch block in main() method or in any other method.