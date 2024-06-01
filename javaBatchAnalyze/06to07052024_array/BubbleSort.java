import java.util.Scanner;
// WAP to print nth largest and smallest element of array.
//sorting using Bubble sort
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array :");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Enter the Elements :");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Given array is  :");
        for (int v : a) {
            System.out.print(v + " ");
        }
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (size - 1) - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        System.out.print("\nSorted Array :");
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
        // To find nth Largest element in sorted array print (nth index-1)
        System.out.print("Search for nth largest and Smallest element :");
        int n = sc.nextInt();
        System.out.println(n + "th largest element is :" + (a[size - n]));
        System.out.println(n + "th Smallest element is :" + (a[n - 1]));
    }

}
