//WAP to create 3 threads named as Natural,Even,Odd by extending Thread class to print respective series upto 20 term.
//and execute these thread using multithreading
class Natural extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " Natural Number :" + i);
        }
        System.out.println("Natural Number printed");
    }
}

class Even extends Thread {
    public void run() {
        int num = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " Even Number :" + num);
            num += 2;
        }
        System.out.println("Even Number printed");
    }
}

class Odd extends Thread {
    public void run() {
        int num = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " Odd Number :" + num);
            num += 2;
        }
        System.out.println("Odd Number printed");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Natural n = new Natural();
        Even e = new Even();
        Odd o = new Odd();
        n.start();
        e.start();
        o.start();
    }

}
