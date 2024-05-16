//WAP to arrange negative number first then positive in an array.

public class ArrangePositiveThenNegativeInArray {
    public static void main(String[] args) {
        int[] a = { 12, -34, 23, 45, -4, -67, -20, 78, 21, -2, -64 };
        int temp;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        for (int i : a)
            System.out.print(i + " ");
    }
}
