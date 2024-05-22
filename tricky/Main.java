import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}

class Main1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            count = count++;
        }
        System.out.println(count);
    }
}

class Main2 {
    public static void main(String[] args) {
        int num = 1;
        for (; num <= 4;) {
            if (num <= 4) {
                System.out.println("Hello!");
                num++;
            }
        }
    }
}
