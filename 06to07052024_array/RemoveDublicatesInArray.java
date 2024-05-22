import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDublicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 8, 4, 9, 8, 4, 7, 4, 4 };
        int n = 10;
        ArrayList<Integer> al = Solution.duplicates(arr, n);
        if (!al.isEmpty()) {
            for (int i : al) {
                System.out.print(i + " ");
            }
        }

    }

}

class Solution {// Efficient Solution
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!seen.add(arr[i])) {
                duplicates.add(arr[i]);

            }
        }

        a.addAll(duplicates);

        if (a.isEmpty()) {
            a.add(-1);
        } else {
            Collections.sort(a);
        }

        return a;
    }
}

class Solution0 {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j] && !a.contains(arr[i])) {
                    a.add(arr[i]);
                }
            }
        }
        if (a.isEmpty()) {
            a.add(-1);
            return a;
        } else {
            Collections.sort(a);
            return a;
        }

    }
}
