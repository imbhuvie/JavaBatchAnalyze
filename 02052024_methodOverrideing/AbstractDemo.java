abstract class Company {
    String cname;

    void getcmp(String name) {
        cname = name;
    }

    abstract void display();
    // abstract void msg();// it should must be implimented in derived class.
}

class Employee extends Company {
    String ename;

    void getemp(String name) {
        ename = name;
    }

    void display() {
        System.out.println("Company name :" + cname);
        System.out.println("Employee name :" + ename);
    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        // Company c=new Company();//It give error
        Employee e = new Employee();

        e.getcmp("Analyze");
        e.getemp("Mohit");
        e.display();
    }
}
