// WAP to input a sentence and find count :
// 1.total number of alphabate.
// 2.total number of digits.
// 3.total number of vowel.
// 4.total number of words.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence :");
        String str = sc.nextLine();
        System.out.println(str);
        String newstr = str.toLowerCase();
        int vowel = 0;
        int digits = 0;
        int alphabate = 0;
        int word = 0;
        for (int i = 0; i < newstr.length(); i++) {
            if (newstr.charAt(i) == 'a' || newstr.charAt(i) == 'e' || newstr.charAt(i) == 'i' || newstr.charAt(i) == 'o'
                    || newstr.charAt(i) == 'u') {
                vowel++;
            }
            if (newstr.charAt(i) == ' ') {
                word++;
            }
            if (isDigit(newstr.charAt(i))) {
                digits++;
            }
            if (isAlpha(newstr.charAt(i))) {
                alphabate++;
            }

        }
        System.out.println("Vowel in sentence :" + vowel);
        System.out.println("words in sentence :" + (word + 1));
        System.out.println("digits in sentence :" + digits);
        System.out.println("alphabates in sentence :" + alphabate);
    }

    static boolean isDigit(char s) {
        for (int i = 48; i < 57; i++) {
            if (s == i)
                return true;
        }
        return false;
    }

    static boolean isAlpha(char s) {
        for (int i = 97; i < 122; i++) {
            if (s == i)
                return true;
        }
        return false;
    }
}

class NewMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence :");
        String str = sc.nextLine();
        System.out.println(str);
        String newstr = str.toLowerCase();
        int vowel = 0;
        int digits = 0;
        int alphabate = 0;
        int word = 0;
        for (int i = 0; i < newstr.length(); i++) {
            char charch = newstr.charAt(i);
            int intch = newstr.charAt(i);
            if (charch == 'a' || charch == 'e' || charch == 'i' || charch == 'o' || charch == 'u')
                vowel++;
            if (charch == ' ')
                word++;
            if (intch >= 97 && intch <= 122)
                digits++;
            if (intch >= 48 && intch <= 57)
                digits++;

        }

        System.out.println("Vowel in sentence :" + vowel);
        System.out.println("words in sentence :" + (word + 1));
        System.out.println("digits in sentence :" + digits);
        System.out.println("alphabates in sentence :" + alphabate);
    }
}