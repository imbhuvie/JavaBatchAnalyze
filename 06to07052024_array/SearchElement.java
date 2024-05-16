//input 10 number and find a number

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array :");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("Enter elements of array :");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("Enter The Element to find :");
        int num = sc.nextInt();
        //printing given elements.
        System.out.print("Elements are :");
        for (int n : ar) {
            System.out.print(n + " ");
        }
        // print only first occurence index of the element
        boolean b = false;
        for (int n : ar) {
            if (num == n)
                b = true;
            else
                continue;
        }
        if (b)
            System.out.println("\n" + num + " is found");
        else
            System.out.println("\n" + num + " not Found");

    }
}

class Searching1 {
    public static int index;

    public static boolean isFound(int a[], int num) {
        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                index = i + 1;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array :");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("Enter elements of array :");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("Enter The Element to find :");
        int num = sc.nextInt();
        // print all the index where number will be
        if (isFound(ar, num)) {
            System.out.println(num + " is found at '" + index + "' Position");
        } else {
            System.out.println(num + " not Found");
        }
    }
}
