class Base{
    int a;
    void getBase(int x){
        a=x;
    }
    void showData(){
        System.out.println("This is a base class method");
        System.out.println("A :"+a);
    }
}
class Derived extends Base{
    int b;
    void getDerived(int x){
        b=x;
    }
    void showData(){
        System.out.println("This is Base class method and overrided by derived class.");
        System.out.println("A :"+a);
        System.out.println("B :"+b);
    }
    void display(){
        showData();
        super.showData();
    }
}
public class OverridExample{
    public static void main(String[] args) {
        Derived d=new Derived();
        d.getBase(50);
        d.getDerived(80);
        d.display();
    }
}