import java.util.Calendar;

class NaturalNumber extends Thread {
    int n, i;

    public void run() {
        n = 20;
        for (int i = 0; i < n; i++) {
            System.out.print(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
            // it send cursor at home and it will print i every time same place
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        // To print Natural Number
        // new NaturalNumber().start();
        // To print Digital clock
        new DigitalClock().start();
    }

}

// WAP for Digital Clock
class DigitalClock extends Thread {
    int h, m, s;
    String time;

    String check(int n) {
        if (n >= 10)
            return "" + n;
        else
            return "0" + n;
    }

    public void run() {

        while (true) {
            Calendar calendar = Calendar.getInstance();
            h = calendar.get(calendar.HOUR);
            m = calendar.get(calendar.MINUTE);
            s = calendar.get(calendar.SECOND);
            time = check(h) + " : " + check(m) + " : " + check(s);
            System.out.print("Time\t" + time);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
    }
}