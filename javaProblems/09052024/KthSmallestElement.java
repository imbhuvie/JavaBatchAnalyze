public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 20, 15 };
        int l = arr.length - 1;
        int r = 0;
        int k = 4;
        int elem = kthSmallest(arr, l, r, k);
        System.out.println(elem);

    }

    static int kthSmallest(int arr[], int l, int r, int k) {
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
        for (int i : arr)
            System.out.println(i);
        return arr[k - 1];
    }
}
