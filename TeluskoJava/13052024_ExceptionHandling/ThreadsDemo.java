class A extends Thread {
    public void run() { // method should be run(), bydefault it execute
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1); // it take break of 10 milisecond.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() { // method should be run(), bydefault it execute
        for (int i = 0; i < 100; i++)
            System.out.println("hii");
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(b.getPriority()); // to check priority
        a.setPriority(5);// to set priority, min is 1 and max is 10
        a.start();// to start the thread
        b.start();// to start the thread
    }

}
