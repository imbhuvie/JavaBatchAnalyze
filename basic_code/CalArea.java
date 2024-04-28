class Area{
    double size1,size2;
    Area(double size1,double size2){
        this.size1=size1;
        this.size2=size2;
    }
    void getRecArea(){
        System.out.println("Area of Rectangle : "+(size1*size2));
    }
    void getTriArea(){
        System.out.println("Area of Rectangle : "+(0.5*(size1*size2)));
    }
}

public class CalArea {
    public static void main(String[] args) {
        Area ob=new Area(5,9);
        ob.getRecArea();
        ob.getTriArea();
    }
    
}
