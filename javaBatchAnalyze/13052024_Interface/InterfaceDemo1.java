
//multiple inheritance using Interface 
import java.io.*;

interface College {
    String c_name = "Integral";
    int c_code = 1020;
    String city = "Lucknow";

    void printStudentDetail();

    void msg();
}

class Department {
    String dname;
    int dcode;

    void getDept(String s1, int s2) {
        dname = s1;
        dcode = s2;
    }
}

class Student extends Department implements College {
    String s_name, s_course, s_sem;

    void inputStudentDetail() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Student Name, course, semester");
        s_name = br.readLine();
        s_course = br.readLine();
        s_sem = br.readLine();
    }

    public void printStudentDetail()// overriding
    {
        System.out.println("College Name\t" + c_name);
        System.out.println("College Code\t" + c_code);
        System.out.println("Department Name\t" + dname);
        System.out.println("Department Code\t" + dcode);
        System.out.println("student name\t" + s_name);
        System.out.println("course      \t" + s_course);
        System.out.println("Semester    \t" + s_sem);
    }

    public void msg() {// override
        System.out.println("This is Lucknow");
    }
}

public class InterfaceDemo1 {
    public static void main(String ar[]) throws IOException {
        System.out.println(College.c_name);
        Student stu = new Student();
        stu.inputStudentDetail();
        stu.getDept("Compter Science", 1002);
        stu.printStudentDetail();
    }
}
