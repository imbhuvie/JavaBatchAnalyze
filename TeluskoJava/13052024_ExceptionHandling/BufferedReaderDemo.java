import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter number :");
        int n = System.in.read();
        // it read only one character and return its ascii value only. read() method is
        // in InputStream there is not readLine() method in this class.
        System.out.println(n);
        // so there is a class
        InputStreamReader ist = new InputStreamReader(System.in);
        // it require an object of InputStream class which is 'in' already predefine
        // object so we don't need to create an object of that class
        BufferedReader br = new BufferedReader(ist);
        // BufferedReader class can take input from anywhere such as
        // file,keyboard,network or anything else
        // it require an object of InputStreamReader class which is we have created
        // manually 'ist' object. now we can take the input using readLine() method of
        // BufferedReader class and now readLine will return String.
        System.out.print("Enter a number :");
        String str = br.readLine();
        // readline Return whole string you input,so we store in String
        System.out.println(str);
        int number = Integer.parseInt(str);
        // here we Parsing String to Integer(non-primitive to primitive)
        System.out.println(number);
        br.close();
        // close the br because it can read from anywhere and for better use of
        // resources we can overuser our resources
    }
}
