import java.util.Scanner;

public class NameInAlphabaticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        String a[] = new String[n];
        System.out.print("Enter n name :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }
        String s = "";
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    s = a[i];
                    a[i] = a[j];
                    a[j] = s;

                }

            }
        }
        System.out.println("sorted array :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        // System.out.println("comparint aman to prince :" + ("Ab".compareTo("ac")));
    }
}
