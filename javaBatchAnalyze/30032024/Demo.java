class University {
    String uname;

    University(String str1) {
        uname = str1;
        System.out.println("class University");
    }

    void showUniv() {
        System.out.println("University name\t" + uname);
    }
}

class College extends University {
    String cname;

    College(String str1, String str2) {
        super(str1);
        cname = str2;
        System.out.println("Class College");

    }

    void showCol() {
        showUniv();
        System.out.println("College Name\t" + cname);
    }

}

class Student extends College {
    String sname;

    Student(String str1, String str2, String str3) {
        super(str1, str2);
        sname = str3;
        System.out.println("Class Student");
    }

    void showStu() {
        showCol();
        System.out.println("Student Name\t" + sname);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student S = new Student("AKTU", "IISE", "Bhupendra");
        S.showStu();
    }
}