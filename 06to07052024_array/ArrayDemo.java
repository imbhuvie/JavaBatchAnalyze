//WAP to initialize an araay of elements and print all elements with sum and everage of all elements

class Demo {
    int a[];
    int sum;

    void getArray(int[] x) {
        a = x;
    }

    void printArray() {
        System.out.print("Elements of array :");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    void getSum() {
        for (int num : a) {
            sum += num;
        }
        System.out.println("\nsum of array :" + sum);
    }

    void getAverage() {
        int size = a.length;
        float avg = sum / size;
        System.out.println("Average :" + avg);
    }

}

public class ArrayDemo {
    public static void main(String[] args) {
        int ar[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        Demo ad = new Demo();
        ad.getArray(ar);
        ad.printArray();
        ad.getSum();
        ad.getAverage();
    }

}