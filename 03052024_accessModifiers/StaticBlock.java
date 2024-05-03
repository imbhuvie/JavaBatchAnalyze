
public class StaticBlock {
    static int a = 20;
    static {
        System.out.println("this is static Block1");
    }

    StaticBlock() {
        System.out.println("this is Constructor Block");
        a=50;
    }

    static {
        System.out.println("this is static Block2");

    }

    static void staticMethod() {
        System.out.println("this is static method");
        System.out.println("A :" + a);
    }

    static {
        staticMethod();
        System.out.println("this is static block 3");
    }

    public static void main(String[] args) {
        System.out.println("Starting main() method");
        new StaticBlock().staticMethod();
    }
    static{
        System.out.println("This is static Block 4");
    }
}
