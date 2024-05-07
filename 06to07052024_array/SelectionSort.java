// WAP to input an array of 10 elements in ascending order in Selection sort

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array :");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Enter the Elements :");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Given array is  :");
        for (int v : a) {
            System.out.print(v + " ");
        }
        int temp;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        System.out.println("Sorted Array :");
        for (int v : a) {
            System.out.print(v + " ");
        }
    }
}