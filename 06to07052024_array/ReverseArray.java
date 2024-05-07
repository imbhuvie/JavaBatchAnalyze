import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array :");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.print("Enter elements of array :");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("Elements Before reverse:");
        for (int n : ar) {
            System.out.print(n + " ");
        }
        int j = size - 1;
        int temp;
        for (int i = 0; i < size / 2; i++, j--) {
            temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;

        }
        System.out.print("\nElements After reverse:");
        for (int n : ar) {
            System.out.print(n + " ");
        }
    }
}
