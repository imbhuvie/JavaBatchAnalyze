public class Number2 {
    int a,b;
    Number2(int x,int y){
        a=x;
        b=y;
        System.out.println("Class Number is created.");
    }

    Number2(Number2 N){
        a=N.a;
        b=N.b;
        System.out.println("Duplicate copy of class Number is created.");
    }
    void swap(){
        int temp=a;
        a=b;
        b=temp;

    }
    void showData(){
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
    public static void main(String[] args) {
        Number2 N=new Number2(20, 80);
        Number2 n2= new Number2(N);
        N.swap();
        System.out.println("Swaped Data");
        N.showData();
        System.out.println("Actual data :");
        n2.showData();
    
    }
}
