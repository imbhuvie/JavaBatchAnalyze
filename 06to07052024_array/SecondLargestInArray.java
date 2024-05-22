// Find Second Largest Element in an array.

public class SecondLargestInArray { // Efficient Solution
    public static void main(String[] args) {
        int[] a = { 3, 7, 77, 78, 1, 4, 9, 87, 87, 56 };

        if (a.length < 2) {
            System.out.println("Array doesn't have enough elements");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int number : a) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }
        System.out.println("Second largest :" + secondLargest);
    }
}
