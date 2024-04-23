import java.util.ArrayList;
import java.util.Arrays;

//sort()
//Math.min(a,b)
//copyOf(oldArray,newArray)
public class Extra {
    public static ArrayList<Integer> findCommonElementsSorted(int[] v1, int[] v2) {
        // Your code here
        Arrays.sort(v1);
        Arrays.sort(v2);
        int i, j, k;
        i = 0;
        j = 0;
        k = 0;
        int x = v1.length;
        int y = v2.length;
        int ns = (x + y) / 2 + 1;
        ArrayList<Integer> result = new ArrayList<>();
        while (i < x && j < y) {
            if (v1[i] == v2[j]) {
                result.add(v1[i]);
                i++;
                j++;
                k++;
            } else if (v1[i] > v2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] V1 = { 3, 4, 2, 2, 4 };
        int[] V2 = { 3, 2, 2, 7, 4, 4 };
        ArrayList<Integer> result = findCommonElementsSorted(V1, V2);
        System.out.println("Common elements in sorted order:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
