
public class Tringle {
    int a,b,c;
    double s,ar;
    Tringle(int a,int b, int c){ //constructor call by value
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void area(){
        s=(a+b+c)/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area :" +ar);
    }
    public static void main(String[] args) {
        // System.out.println("Hello?");
        Tringle t=new Tringle(8,4,9);
        t.area();
    }
}
