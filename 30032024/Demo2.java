class Number {
    int a;

    Number(int x) {
        a = x;
        System.out.println("class Number");
    }
}

class Value extends Number {
    int b;

    Value(int x, int y) {
        super(x);
        b = y;
        System.out.println("Class Value");
    }
}
class Data extends Value{
    int c;
    Data(int x,int y,int z){
        super(x, y);
        c=z;
        System.out.println("Class Data");
    }
    void showData(){
        System.out.println("A :"+a);
        System.out.println("B :"+b);
        System.out.println("C :"+c);
    }
}
public class Demo2 {
public static void main(String[] args) {
    Data d=new Data(10, 20, 30);
    d.showData();
}
}
