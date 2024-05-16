// WAP to and input an array and input a number find the subarray which addition is that number.

public class FindSubarrayOfN {
    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 8, 5, 4, 2, 1, 4, 6, 3, 7, 9, 3, 4, 2 };
        int s = 9;
        int sum;
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            sum = a[i];
            if (sum == s) {
                System.out.println("fond at index " + i);
            } else {
                for (int j = i + 1; j < a.length; j++) {
                    sum += a[j];
                    if (sum == s) {
                        System.out.println("fond from index " + i + " to " + j);
                        break;
                    }
                }
            }
        }
    }
}
