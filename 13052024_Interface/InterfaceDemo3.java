
// Program to Demonstration of an interface can extends another interface
interface University {
    String uname = "AKTU";
    String city = "Lucknow";

    void putuniversity();
}

interface UGC {
    String ugc = "University Grant Commision";

    void show();
}

interface College extends University, UGC // Multiple Inheritance
{
    String cname = "IET";
    String city = "Lucknow";

    void putcollege();
}

class Student implements College {

    String sname, scourse;

    static void display() {
        System.out.println("Hello");
    }

    void getstudent(String str1, String str2) {
        sname = str1;
        scourse = str2;
    }

    void putstudent() {
        Student.display();
        System.out.println("Student Name\t" + sname);
        System.out.println("Course\t" + scourse);
    }

    public void putuniversity() {// overriding
        System.out.println("University Name\t" + uname);
        System.out.println("City\t" + city);
    }

    public void putcollege() {
        System.out.println("College Name\t" + cname);
        System.out.println("City\t" + city);
    }

    public void show() {
    }
}

public class InterfaceDemo3 {
    public static void main(String ar[]) {
        Student stu = new Student();
        stu.getstudent("James", "MCA");
        stu.putuniversity();
        stu.putcollege();
        stu.putstudent();
    }
}
