class Number{
int a;
float b;
boolean c;
void showData(){
int d;
System.out.println(a);
System.out.println(b);
System.out.println(c);
//System.out.println(d); //Give Error beacuse it will not initialise.																																																																														 
}
public static void main(String args[]){
Number N=new Number();
N.showData();
}
}