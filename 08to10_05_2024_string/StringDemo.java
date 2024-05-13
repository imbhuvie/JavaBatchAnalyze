// WAP to input ANALYZE and print

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String: ");
        String institute = sc.nextLine();
        for (int i = 1; i <= institute.length(); i++) {
            System.out.println(institute.substring(0, i));
        }
        for (int i = 0; i < institute.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(institute.charAt(j));
            }
            System.out.println();
        }
    }

}

// WAP to input 10 name and search particular name found or not.
class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sa[] = new String[10];
        System.out.print("Enter 10 name :");
        for (int i = 0; i < 10; i++) {
            sa[i] = sc.nextLine();
        }
        System.out.print("Enter Name to search :");
        String s = sc.nextLine();
        boolean b = false;
        for (String i : sa) {
            if (s.equals(i)) {
                System.out.println(s + " is found ");
                b = true;
                break;
            }
        }
        if (b == false)
            System.out.println("not found");
    }
}
