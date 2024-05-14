import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList with elements of different types
        ArrayList<Object> a1 = new ArrayList<>();
        a1.add(87);
        a1.add("hello");
        a1.add(6534.64646);
        a1.add("aman");

        // Create a HashSet to store elements from the ArrayList
        HashSet<Object> hs = new HashSet<Object>();

        // Add each element from the ArrayList to the HashSet
        for (Object obj : a1) {
            hs.add(obj);
        }

        // Print the HashSet
        System.out.println("HashSet: " + hs);
    }
}
