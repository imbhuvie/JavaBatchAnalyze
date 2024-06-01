//WAP to create an array of object(of clas Student) and store rollnumber,name,marks and print 

import java.util.Scanner;

class Student {
    int roll_number;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many student you want create : ");
        int s = sc.nextInt();
        Student a[] = new Student[s];
        int count = 1;
        for (int i = 0; i < s; i++) {

            a[i] = new Student();
            System.out.print(count + ". Enter Roll Number :");
            a[i].roll_number = sc.nextInt();
            sc.nextLine();
            System.out.print(count + ". Enter Name :");
            a[i].name = sc.nextLine();
            System.out.print(count + ". Enter Marks :");
            a[i].marks = sc.nextInt();
            count++;
        }
        for (Student i : a) {
            System.out.printf("Roll Number :" + i.roll_number + "\tName :" + i.name + "\tMarks :" + i.marks);
        }
    }
}
