class Area {
    double ar;
    void area(int a){
        ar=(a*a);
        System.out.println("Area of Square :"+ar);
    }
    void area(int a,int b){
        ar=(a*b);
        System.out.println("Area of Rectangle :"+ar);
    }
    void area(int a,int b,int c){
        double s=(a+b+c)*0.5;
        ar=Math.sqrt(s*(s-1)*(s-b)*(s-c));
        System.out.println("Area of Triangle :"+ar);
    }
    void area(double r){
        ar=Math.PI*r*r;
        System.out.println("Area of Circle :"+ar);
    }
}
public class Shape1 {
    public static void main(String[] args) {
        Area a=new Area();
        a.area(5);
        a.area(5,10);
        a.area(10,10,4);
        a.area(6.0);
    }
}
