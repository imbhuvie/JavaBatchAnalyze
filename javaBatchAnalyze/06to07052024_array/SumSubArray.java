// WAP to and input an array and input a number find the subarray which addition is that number.

public class SumSubArray {
    public static void main(String[] args) {
        int[] a = { 2, 4, 6, 8, 4, 5, 1, 9, 7 };
        int s = 6;
        int i, j;
        boolean b = true;
        for (i = 0; i < a.length; i++) {
            int sum = a[i];
            if (sum == s) {
                System.out.println("subarray of " + s + " found at index :" + i);
                b = false;
            }
            for (j = i + 1; j < a.length; j++) {
                sum += a[j];
                if (sum > s)
                    break;
                else if (sum == s) {
                    System.out.println("subarray of " + s + " found at index :" + i + " to " + j);
                    b = false;
                }

            }

        }
        if (b) {
            System.out.println("subarray of " + s + " not found");
        }
    }
}
