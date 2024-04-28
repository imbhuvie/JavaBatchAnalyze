import java.util.Scanner;

class Student {
    /*
     * input name, roll no., marks of three subject and generate marsheet of student
     * with mmarks ,
     * percantage and division for 3 students.
     * 
     */
    String name;
    int rono, mark1, mark2, mark3, total;
    float percantage;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Roll Number: ");
        rono = sc.nextInt();
        System.out.print("Enter Marks of 3 subject : ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
    }

    void marksheet() {
        total = mark1 + mark2 + mark3;
        percantage = total / 3.0f;
        String div;
        if (percantage >= 60) {
            div = "First Division.";
        } else if (percantage >= 45) {
            div = "Second Division.";
        } else if (percantage >= 33) {
            div = "Third Division.";
        } else {
            div = "Fail";
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Name :" + name);
        System.out.println("Roll Number :" + rono);
        System.out.println("Total Marks ;" + total);
        System.out.println("Percantage :" + percantage);
        System.out.println("Division :" + div);
        System.out.println("------------------------------------------------------");

    }

}

public class RunStudent {

    public static void main(String[] args) {                                                                                                                                                                                                                                                                                    
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.input();
        s1.marksheet();
        s1.input();
        s1.marksheet();
        s1.input();
        s1.marksheet();
    }
}                                                        