// WAP to create a class Dimension to input 2 variable a,b amd method getData() and area()
//     create 2 subClasses Rectangle and Triangle to compute Area of respective shape by overriding the Area() methodclass Dimension{
    
class Dimension{
    double a,b;
    void getData(int x,int y){
        a=x;
        b=y;
    }
    void area(){
        System.out.println("Area: ");
    }
}
class Rectangle extends Dimension{
    void area(){
        System.out.println("Area of Rectangle :"+(a*b));
    }
}
class Triangle extends Dimension{
    void area(){
        System.out.println("Area of Rectangle :"+(0.5*a*b));
    }
}
public class RunDimension{}