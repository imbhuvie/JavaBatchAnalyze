import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void takeInput() {
        int t = sc.nextInt();

        while (t-- > 0) {

            // Your code here
            int a = sc.nextInt();
            float b = sc.nextFloat();
            long c = sc.nextLong();
            byte d = sc.nextByte();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(s);
        }
    }

    public static void unaryOperator() {
        int a = 20;
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(-a);

    }

    public static void divisionOfTwoNum() {
        int a, b, res;
        System.out.println("Enter two number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (b != 0) {
            res = a / b;
            System.out.println("Division is :" + res);
        }
    }

    public static void checkVowel() throws IOException {
        System.out.print("Enter Character :");
        char a;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        a = (char) br.read();
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U')
            System.out.println(a + " is Vowel");
        else
            System.out.println(a + " is consonent");

    }

    public static void evenOdd() {
        int a;
        System.out.print("Enter a Number :");
        a = sc.nextInt();
        if (a % 2 == 0)
            System.out.println(a + " is even");
        else
            System.out.println(a + " is odd");
    }

    public static void largestAmong2() {
        int a, b, res;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2 number :");
        a = scan.nextInt();
        b = scan.nextInt();
        res = (a > b) ? a : b;
        System.out.println("Lasgest number is :" + res);
    }

    public static void largestAmong3() {
        int a, b, c, res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        res = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Lasgest number is :" + res);
    }

    public static void positiveNegative() {
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println(n + " is positive");
        else if (n < 0)
            System.out.println(n + " is negative");
        else
            System.out.println(n + " is Zero");
    }

    public static void secondLargest() {
        System.out.print("Enter three numbers :");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            if (b > c)
                System.out.println(b);
            else
                System.out.println(c);
        } else if (b > c) {
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if (a > b)
                System.out.println(a);
            else
                System.out.println(b);
        }
    }

    public static void roots() throws IOException {
        System.out.print("Enter Coefficient :");
        int a, b, c, d;
        double r1, r2;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        d = (b * b - 4 * a * c);
        if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are " + r1 + ", " + r2);
        } else if (d == 0) {
            r1 = -b / (2 * a);
            System.out.println("Roots are same :" + r1);
        } else {

            System.out.println("no real root");
        }
    }

    public static void switchCases() {
        int a, b, ch;
        double result;
        System.out.print("Enter the two number :");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter your choice :");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                result = a + b;
                System.out.println("Addition is :" + result);
                break;
            }
            case 2: {
                result = a - b;
                System.out.println("Subtraction is :" + result);
                break;
            }
            case 3: {
                result = a * b;
                System.out.println("Multiplication is :" + result);
                break;
            }
            case 4: {
                result = a / b;
                System.out.println("Division is :" + result);
                break;
            }
            default:
                System.out.println("Enter a valid choice");
        }
    }

    public static void areaUsingSwitch() {
        System.out.print(
                "Choose an option:\n1.Area of square\n2.Area of rectangle\n3.Area of circle\n4.Area of triangle\nPlease enter your choice :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.print("Enter the side of square :");
                int side = sc.nextInt();
                double res = side * side;
                System.out.println("Area of square is " + res);
                break;
            }
            case 2: {
                System.out.print("Enter the length of rectangle :");
                int length = sc.nextInt();
                System.out.print("Enter the width of rectangle :");
                int width = sc.nextInt();
                double res = length * width;
                System.out.println("Area of rectangle is " + res);
                break;
            }
            case 3: {
                System.out.print("Enter the radius of circle :");
                int radius = sc.nextInt();
                double res = 2 * Math.PI * radius * radius;
                System.out.println("Area of circle is " + res);
                break;
            }
            case 4: {
                // System.out.print("Enter the base of triangle :");
                // int base = sc.nextInt();
                // System.out.print("Enter the height of triangle :");
                // int height = sc.nextInt();
                // double res = 0.5 * base * height;
                System.out.println("Enter the 3 sides of triangle :");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                double s = (a + b + c) / 2;
                double res = Math.sqrt((s * (a - 1) * (s - b) * (s - c)));
                System.out.println("Area of triangle is " + res);
                break;
            }
            default: {
                System.out.println("Please select a Valid option.");
            }

        }
    }

    public static void checkVowelUsingSwitch() {
        System.out.print("Enter a character :");
        char ch = sc.next().charAt(0);
        if ((int) ch >= (int) 'a' && (int) ch <= (int) 'z' || (int) ch >= (int) 'A' && (int) ch <= (int) 'Z') {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': {
                    System.out.println(ch + " is a vowel");
                    break;
                }
                default: {
                    System.out.println(ch + " is consonent");
                }
            }
        }

    }

    public static void dayOfWeek() {
        System.out.print("Enter the day :");
        int day = sc.nextInt();
        switch (day) {
            case 1: {
                System.out.println("Sunday");
                break;
            }
            case 2: {
                System.out.println("Monday");
                break;
            }
            case 3: {
                System.out.println("Tuesday");
                break;
            }
            case 4: {
                System.out.println("Wednesday");
                break;
            }
            case 5: {
                System.out.println("Thursday");
                break;
            }
            case 6: {
                System.out.println("Friday");
                break;
            }
            case 7: {
                System.out.println("Sutarday");
                break;
            }
            default: {
                System.out.println("Wrong Input, Try Again");
            }

        }
    }

    public static void bonusSalary() {
        System.out.print("Enter Employee code :");
        int empCode = sc.nextInt();
        System.out.print("Enter the Salary of Employee :");
        double salary = sc.nextDouble();
        switch (empCode) {
            case 100: {
                double bonus = (salary * 5) / 100;
                System.out.println("Bonus : " + bonus);
                break;
            }
            case 200: {
                double bonus = (salary * 1) / 100;
                System.out.println("Bonus : " + bonus);
                break;
            }
            case 300: {
                double bonus = (salary * 2) / 100;
                System.out.println("Bonus : " + bonus);
                break;
            }
            case 400: {
                double bonus = (salary * 25) / 100;
                System.out.println("Bonus : " + bonus);
                break;
            }
            default: {
                System.out.println("This Employee Code is not specified for bonus.");
            }
        }
    }

    public static void tableUsingWhile() {
        int n, i = 1, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();
        System.out.println("Table of " + n + " : ");
        while (i <= 10) {
            t = n * i;
            System.out.println(n + " * " + i + " = " + t);
            i++;
        }
    }

    public static void tableUsingFor() {
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int t;
        System.out.println("Table of " + n + " : ");
        for (int i = 1; i <= 10; i++) {
            t = n * i;
            System.out.println(n + " * " + i + " = " + t);
        }
    }

    public static void tableUsingDoWhile() {
        int n, i = 1, t;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();
        System.out.println("Table of " + n + " : ");
        do {
            t = n * i;
            System.out.println(n + " * " + i + " = " + t);
            i++;
        } while (i <= 10);
    }

    public static void sumOfDigit() {
        System.out.print("Enter a numbre :");
        int n = sc.nextInt();
        int sum = 0;
        int rem;
        while (n != 0) {
            rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        System.out.println("sum of digits : " + sum);

    }

    public static void reverseNumber() {
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int rem;
        System.out.print("Reverse Number :");
        while (n != 0) {
            rem = n % 10;
            System.out.print(rem);
            n /= 10;
        }
    }

    public static void checkPrime() {

        boolean b = false;
        System.out.print("Enter Number :");
        int n = sc.nextInt();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                b = true;
                break;
            }
        }
        if (b)
            System.out.println(n + " Not Prime");
        else
            System.out.println(n + " PRIME NUMBER");
    }

    public static void sumOfFactor() {
        System.out.print("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("Factors : ");
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        if (sum == 0)
            System.out.println("no Factor");
        else
            System.out.print("\nsum of Factors :" + sum);
    }

    public static void main(String args[]) throws IOException {
        // Take input
        // takeInput();
        // Unary Operator in java
        // unaryOperator();
        // wap to find division of 2 number if second num is not equal to 0.
        // divisionOfTwoNum();
        // To check char is vowel or consonent.
        // checkVowel();
        // To check Even Odd
        // evenOdd();
        // Largest Among two number
        // largestAmong2();
        // Largest Among three number
        // largestAmong3();
        // TO check Positive and negative
        // positiveNegative();
        // To check Second Largest
        // secondLargest();
        // To find roots when coefficient are given
        // roots();
        // Implimentation of Switch case:
        // switchCases();
        // Write the progrsm to find one the following operation according to user
        // choice
        // 1.Area of square
        // 2.Area of triangle
        // 3.Area of circle
        // 4.Area of rectangle
        // areaUsingSwitch();
        // check if a char is vowel or consonent using switch case.
        // checkVowelUsingSwitch();
        // WAP program to input Day of week and print name of day using switch case
        // dayOfWeek();
        // find bonus for the employees while empcode and bonus in % is given below
        // using switch.
        // empCode, bonus in %
        // 100, 5
        // 200, 1
        // 300, 2
        // 400, 25
        // bonusSalary();
        // tableUsingWhile();
        // tableUsingDoWhile();
        // tableUsingFor();
        // sumOfDigit();
        // reverseNumber();
        // checkPrime();
        // sumOfFactor();
    }

}