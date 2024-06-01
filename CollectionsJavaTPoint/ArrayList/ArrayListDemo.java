package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(34);
        list.add(45);
        // To make list Iterable.
        Iterator iList = list.iterator();
        while (iList.hasNext()) {
            System.out.print(iList.next() + " ");
        }
        List l = new ArrayList<>();
        l.add(1);
        l.add(45);
        l.add("dbv");
        Iterator il = l.iterator();
        while (il.hasNext()) {
            System.out.println(il.next() + " ");
        }
    }
}