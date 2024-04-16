import java.util.Scanner;

public class BonusSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            }9
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
}
