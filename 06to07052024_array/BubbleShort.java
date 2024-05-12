public class BubbleShort {
    public static void main(String[] args) {
        int[] a = { 45, 76, 32, 49, 86, 13, 26, 74, 56, 74, 34 };
        int n = a.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
