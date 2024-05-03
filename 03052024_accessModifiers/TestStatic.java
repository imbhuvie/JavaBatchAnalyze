//Demonstrate static keyword
class Employee{
    String ename;
    int ecode;
    float esal;
    static int count;
    void getEmp(int code,String name,float sal){
        ecode=code;
        ename=name;
        esal=sal;
        count++;
    }
    void putEmp(){
        System.out.println("Employee Name :"+ename);
        System.out.println("Employee Code :"+ecode);
        System.out.println("Employee Salary :"+esal);
    }
    static void showCount(){
        System.out.println("Total Employee :"+count);
    }
}
public class TestStatic {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        int c=30;
        // System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("c :"+c);
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.getEmp(1020, "William", 78000.0f);
        e2.getEmp(1021, "Velly", 88000.0f);
        e3.getEmp(1022, "James", 98000.0f);
        e1.putEmp();
        e2.putEmp();
        e3.putEmp();
        Employee.showCount();
        e2.showCount();
    
    }

}
