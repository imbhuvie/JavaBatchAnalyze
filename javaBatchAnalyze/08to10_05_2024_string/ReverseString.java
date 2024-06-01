import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String string = sc.nextLine();
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }
        System.out.println("Origanal String : " + string);
        System.out.println("Reverse String : " + reverseString);
    }
}
