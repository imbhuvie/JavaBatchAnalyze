// WAP to demonstrate the Multi-Threading by extends Thread class

class Table3 extends Thread {
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

class Table5 extends Thread {
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

class Table7 extends Thread {
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

public class ThreadDemo1 {
  public static void main(String[] args) {
    Table3 t3 = new Table3();
    Table5 t5 = new Table5();
    Table7 t7 = new Table7();
    t3.start();
    t5.start();
    t7.start();
  }
}

// NOTE : In execution of this program may slightly differente from previous output

