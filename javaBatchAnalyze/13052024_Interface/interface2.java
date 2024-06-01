
// Program to Demonstration of a class can implements more than 1
// Inerfaces(Multiple Inharitance
interface Company {
    String cname = "ANALYZE";
    String city = "Lucknow";

    void putcompany();
}

interface Department {
    String dname = "SD";
    String dcode = "ai1020";

    void putdept();
}

class Employee implements Company, Department {
    String ename, epost;

    void getemp(String str1, String str2) {
        ename = str1;
        epost = str2;
    }

    public void putdept() {
        System.out.println("Department Name\t" + dname);
        System.out.println("DepartmentCode\t" + dcode);
    }

    public void putcompany() {// overriding
        System.out.println("Company Name\t" + cname);
        System.out.println("City\t" + city);
    }

    void putemp() {
        System.out.println("Employee Name\t" + ename);
        System.out.println("Post\t" + epost);
    }
}

class InterfaceDemo3 {
    public static void main(String ar[]) {
        Employee emp = new Employee();
        emp.getemp("James", "SE");
        emp.putemp();
        emp.putcompany();
        emp.putdept();
    }
}