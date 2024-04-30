class Message {
    Message(){
        System.out.println("constructor msg");
    }
    void show(){
        System.out.println("This is show()");
    }
    void msg(){
        System.out.println("This is msg()");
    }
    void display(){
        System.out.println("This Display()");
        this.show();
        msg();//JDK7 and upper version support call current class method without this keyword.
    }

 
}
public class TestThis{
public static void main(String[] args) {
    Message m=new Message();
    m.display();
}
}