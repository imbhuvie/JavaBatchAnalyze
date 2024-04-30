// (without super(20);)this program show compile time exception bcoz list of actual and formal arguemnt are differ 

class Number{
    int a;
    Number(int x){
        a=x;
        System.out.println("class Number");
    }
}
class Value extends Number{
    int b;
    Value(int x){
        super(20);
        b=x;
        System.out.println("class Value");
    }
    void showData(){
        System.out.println("a :"+a);//20
        System.out.println("b :"+b);//30
    }
}
public class SuperTest {
public static void main(String[] args) {
    Value ob=new Value(30);
    ob.showData();

}
}
