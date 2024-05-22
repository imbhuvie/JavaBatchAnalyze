class Natural extends Thread {
    int n, i;

    public void run() {
        n = 20;
        for (int i = 1; i < n; i++) {
            System.out.println(" Natural : " + i);
        }
    }
}

class Even extends Thread {
    int n, i;

    public void run() {
        n = 40;
        for (int i = 2; i < n; i += 2) {
            System.out.println(" Even :" + i);
        }
    }
}

class Odd extends Thread {
    int n, i;

    public void run() {
        n = 40;
        for (int i = 1; i < n; i += 2) {
            System.out.println(" Odd :" + i);
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {

        Natural n = new Natural();
        Even e = new Even();
        Odd o = new Odd();
        n.setPriority(10);
        e.setPriority(Thread.MIN_PRIORITY);
        o.setName("OOD Number");
        System.out.println("Name :" + n.getName() + ": :Priority :" + n.getPriority());
        System.out.println("Name :" + e.getName() + ": :Priority :" + e.getPriority());
        System.out.println("Name :" + o.getName() + ": :Priority :" + o.getPriority());
        System.out.println("Natural :" + n);
        System.out.println("Even :" + e);
        System.out.println("Odd :" + o);
        n.start();
        e.start();
        o.start();
    }
}
