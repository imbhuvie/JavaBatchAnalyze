
public class MultipleCatchException {
    public static void main(String[] args) {
        int j = 9;
        int i = 2;
        String s = null;
        int a[] = new int[5];
        try {
            j /= i;// create exception when i=0
            System.out.println(s.length()); // create Exception when s=null
            System.out.println(a[4]);
            System.out.println(a[5]);// create exception when size of array a is 5
        } catch (ArithmeticException e) {
            System.out.println("Can't devide by zero");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index of array is out of given size");
        } catch (Exception e) { // you can use Exception the parent class of all type of exception if you don't
                                // know the type of exception can occur.
            e.printStackTrace();// it provide exception type with location.
            System.out.println("Something Went Wrong :" + e);
            ;
        }
    }
}
