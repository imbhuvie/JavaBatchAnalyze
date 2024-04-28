class Number {
    private int a;
    int b;
    protected int c;
    public int d;

    void geta(int x) {
        a = x;
    }

    void getbcd(int x, int y, int z) {
        b = x;
        c = y;
        d = z;
    }

    void puta() {
        System.out.println("a :"+a);
    }
    void putbcd(){
        System.out.println("b :"+b);
        System.out.println("c :"+c);
        System.out.println("d :"+d);
    }

}
class Value extends Number{
int e,f;
void getef(int x,int y){
    e=x;
    f=y;
    
}
void putef(){
    System.out.println("e :"+e);
    System.out.println("f :"+f);
}   
void showAll(){
    System.out.println("All avriables values :");
    // System.out.println("a :"+a);
    System.out.println("b :"+b);
    System.out.println("c :"+c);
    System.out.println("d :"+d);
    System.out.println("e :"+e);
    System.out.println("f :"+f);
}

}
public class InheritanceExample{
    public static void main(String[] args) {
        Number N=new Number();
        Value V=new Value();
        N.geta(11);
        N.getbcd(21, 31, 41);
        V.getbcd(50, 60, 70);
        V.getef(80,90);
        N.puta();//11
        N.putbcd();//21,31,41
        V.putbcd();//50,60,70
        V.putef();//80,90
        V.showAll();//

    }
}
