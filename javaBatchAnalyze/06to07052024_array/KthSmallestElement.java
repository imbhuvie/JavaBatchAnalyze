// WAP to find kth smallest number.

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 20, 15, 67, 3, 24 };
        int l = arr.length - 1;
        // int r = 0;
        int k = 4;
        System.out.print("Array is :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int elem = kthSmallest(arr, l, k);
        System.out.println("\n" + k + "th smallest element is :" + elem);

    }

    static int kthSmallest(int arr[], int l, int k) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("\nSorted Array is :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        return arr[k - 1];
    }
}
