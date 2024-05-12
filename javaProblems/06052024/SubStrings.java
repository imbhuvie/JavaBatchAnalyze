import java.util.Scanner;

public class SubStrings {
    public static void main(String args[]) {
        String string, sub;
        int i, c, length;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string = in.nextLine();

        length = string.length();
        System.out.println("Substrings of \"" + string + "\" are :-");
        // System.out.println(string.substring(0, 1));
        // System.out.println(string.substring(1, 2));
        for (i = 0; i <= length; i++) {
            for (int j = 0; j <= length - i; j++) {
                sub = string.substring(i, j+i);
                System.out.println(sub);
            }
        }
    }
}