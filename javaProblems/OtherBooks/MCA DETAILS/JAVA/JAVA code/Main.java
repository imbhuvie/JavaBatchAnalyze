// import java.lang.String;
import java.io.*;
import java.lang.StringBuffer;
//import java.util.ArrayList;
class a{
public static void main(String args[]){
System.out.print("Class a");
}
}
class b{
public static void main(String args[]){
System.out.print("Class b");
}
}
class c{
public static void main(String[] args) 
{
    System.out.println("hello java in class c");
}
}
class t1{
public static void main(String args[])
{
String s=new String("Durga");
Thread t=new Thread();
Exception e=new Exception();
StringBuffer sb=new StringBuffer("Durga");
NewMain nm=new NewMain();
nm.msg();

}
}
class abab{
    public static void main(String[] args) {
        String newstr="";
        String s = "bhuvie";
        int i;
        char temp;
        System.out.println("Given String : "+s);
        for(i=0;i<s.length();i++)
        {
            temp=s.charAt(i);
            newstr=temp+newstr;
        }
        System.out.println("reversed String : "+newstr);
    }
}

class Reverse
{
    // Complete the function
    // str: input string
public static void main(String[] args) {
    
        // Reverse the string str
        String s="Geeks",newstr="";
        char temp;
        System.out.println("Old String : "+s);
        for(int i=0;i<s.length();i++)
        {
            temp=s.charAt(i);
            newstr=temp+newstr;
        }
        System.out.println("Reverse String is : "+newstr);
    }
}

class RevStr {
    public static void main(String[] args) {
        String f="Geeksforgeeks";
        StringBuffer s=new StringBuffer(f);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
class test1{
    public static void main(String[] args) {
        //String is immuatable we can't make changes
        String s=new String("Hello");
        s.concat("java");
        System.out.println(s);
        s=s.concat("java");
        System.out.println("s1="+s);
    }
}
class test2{
    public static void main(String[] args) {
        //String is muatable we can make changes
        StringBuffer s=new StringBuffer("Hello");
        s.append("java");
        System.out.println(s);
        s.append("java");
        System.out.println(s);
        s.append("java");
        System.out.println("s1="+s);
    }
}
class test3{
    public static void main(String[] args) {
        int String=1000;
        int Runnable=535;
        String s=new String("Hello ji");
        System.out.println(s);
        //we can use predifine classand interfaces name as a variables but not keyword or reserved word.
        System.out.println(String);
        System.out.println(Runnable);

    }
}
abstract class x{
    abstract void printmethod();
    void printme()
    {
        System.out.println("content of base class x");
    }
}
class y extends x{
    void printmethod()
{
    System.out.println("content of derived class y");
}
}
class test4{
    public static void main(String[] args) {
        // y a=new y();
        // a.printmethod();
        // a.printme();
        test5 s=new test5();
        s.Student();
        // System.out.println(s.Student());

    }
} 
class test5{
    int rn=10;
    String name="bhupendra";
    public void Student()
    {
        System.out.println("Roll No -"+this.rn);
        System.out.println("Name -"+this.name);
    }
}