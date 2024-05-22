// WAP to demonstrate the Multi-Threading by implimenting Runnable interface
class Table3 implements Runnable {
    int i, n, t;

    public void run() {
        n = 3;
        for (int i = 1; i < 11; i++) {
            t = n * i;
            System.out.println(n + "*" + i + "=" + t);
        }
        System.out.println("End of table " + n);
    }
}

class Table5 implements Runnable {
    int i, n, t;

    public void run() {
        n = 5;
        for (int i = 1; i < 11; i++) {
            t = n * i;
            System.out.println(n + "*" + i + "=" + t);
        }
        System.out.println("End of table " + n);
    }
}

class Table7 implements Runnable {
    int i, n, t;

    public void run() {
        n = 7;
        for (int i = 1; i < 11; i++) {
            t = n * i;
            System.out.println(n + "*" + i + "=" + t);
        }
        System.out.println("End of table " + n);
    }
}

public class RunnableDemo1 {
    public static void main(String[] args) {
        Table3 t3 = new Table3(); // Partial Thread
        Table5 t5 = new Table5(); // Partial Thread
        Table7 t7 = new Table7(); // Partial Thread

        // Runnable is parent so we can do....

        // Runnable t3 = new Table3(); // Partial Thread
        // Runnable t5 = new Table5(); // Partial Thread
        // Runnable t7 = new Table7(); // Partial Thread

        // These will not execute directly using start() method.
        // First create thread of these partial thread.

        Thread t33 = new Thread(t3);
        Thread t55 = new Thread(t5);
        Thread t77 = new Thread(t7);
        t33.start();
        t55.start();
        t77.start();
    }
}
