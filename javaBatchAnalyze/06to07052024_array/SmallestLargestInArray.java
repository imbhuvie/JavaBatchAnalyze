//WAP to take input array and print smallest and largest among them

import java.util.Scanner;

public class SmallestLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array :");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("Enter elements of array :");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("Elements are :");
        for (int n : ar) {
            System.out.print(n + " ");
        }
        int smallest = ar[0];
        int largest = ar[0];
        for (int i = 1; i < size; i++) {
            if (smallest > ar[i])
                smallest = ar[i];
            if (largest < ar[i])
                largest = ar[i];
        }
        System.out.println("\nLargest Elements :" + largest);
        System.out.println("Smallest Elements :" + smallest);

    }
}
