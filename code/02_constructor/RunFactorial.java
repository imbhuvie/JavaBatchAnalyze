class Factorial {
    int n,fact=1;
    Factorial(){
        n=4;
    }
    Factorial(int a){
        n=a;
    }
    Factorial(Factorial F){
        n=F.n;
    }
    void showFact(){
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;
        } 
        System.out.println("Factorial of "+n+" :"+fact);
    }
}
public class RunFactorial{
    public static void main(String[] args) {
        Factorial F1=new Factorial();
        Factorial F2=new Factorial(5);
        Factorial F3=new Factorial(F1);
        F1.showFact();
        F2.showFact();
        F3.showFact();
        System.out.println(F1);
    }
}
