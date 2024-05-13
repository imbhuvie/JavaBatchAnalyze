interface Company {
    String cname = "Analyze";
    // int a;//error
    int pin = 226022;

    void showData();

    void display();

}

class Employee implements Company {
    String ename;
    int ecode;

    void getData(String name, int code) {
        ename = name;
        ecode = code;
    }

    public void showData() {
        System.out.println("Company :" + cname);
        System.out.println("Pin Code :" + pin);
        System.out.println("Employee Name :" + ename);
        System.out.println("Employee Code :" + ecode);
    }

    public void display() {
        // must override but if not need just leave without any statement
    }
}

public class RunInterface {
    public static void main(String[] args) {
        // Company ci=new Company();
        // give error interface cannot instantiate

        Employee c = new Employee();
        c.getData("Bhupendra Verma", 17);
        c.showData();
        var a=89;
        var b="hello";
        var e='a';
        var d=56453.4f;
        System.out.println("a :"+a+"\nb :"+b+"\ne :"+e+"\nd :"+d);
    }
}