/*Given an unsorted array A of size N that contains only non negative integers, 
find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.
Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.

*/

import java.util.ArrayList;

class Solution2 {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> index = new ArrayList<>();

        int sum = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum > s && j < i) {
                sum -= arr[j];
                j++;
            }
            if (sum == s) {
                index.add(j + 1);
                index.add(i + 1);
                return index;
            }
        }
        index.add(-1);
        return index;

    }
}

public class FindSumOfSubArrayInArray {
    public static void main(String[] args) {
        int N = 1, S = 0;
        int[] A = { 0 };

        ArrayList<Integer> index = Solution2.subarraySum(A, N, S);
        if (!index.isEmpty())

            try {
                System.out.println(index.get(0) + " to " + index.get(1));

            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
    }
}

class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> index = new ArrayList<>();

        int sum;
        for (int i = 0; i < n; i++) {
            sum = arr[i];
            if (sum == s) {
                index.add(i + 1);
                index.add(i + 1);

                return index;
            } else {
                for (int j = i + 1; j < n; j++) {
                    sum += arr[j];
                    if (sum == s) {
                        index.add(i + 1);
                        index.add(j + 1);
                        return index;
                    } else if (sum > s)
                        break;
                }
            }

        }
        index.add(-1);
        return index;

    }
}
