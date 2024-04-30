class Number{
    int a,b;
    Number(){
        a=10;
        b=20;
    }
}
class Value extends Number{
    int a,b;
    Value(){
        a=50;b=60;

    }
    void showData(){
        System.out.println("SubClass class Data :");
        System.out.println("A :"+a);
        System.out.println("B :"+b);
        System.out.println("SuperClass class Data :");
        System.out.println("A :"+super.a);
        System.out.println("B :"+super.b);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Value v=new Value();
        v.showData();
    }
}
