public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Hello ");// by dwfault it take space 16
        System.out.print("Name : " + name);
        System.out.print(" :: Capacity :" + name.capacity());
        System.out.println(" :: length : " + name.length());
        name.append("bhup endr a");
        name.append(" Verma");
        System.out.print("Name : " + name);
        System.out.print(" :: Capacity :" + name.capacity());
        System.out.println(" :: length : " + name.length());
        // byte b = 9;
        // short s = 7;
        // int i = 9;
        // char c = '1';
        // long l = 5678;
        // float f = 78.87f;
        // double d = 5678.54;
        // String string = "bhupendra";
        // StringBuffer stringBuffer = new StringBuffer("Hello");
        // StringBuilder stringBuilder = new StringBuilder("Java");
        // System.out.println("byte b datatype :" + ((Object)
        // b).getClass().getSimpleName());
        // System.out.println("short s datatype :" + ((Object)
        // s).getClass().getSimpleName());
        // System.out.println("int i datatype :" + ((Object)
        // i).getClass().getSimpleName());
        // System.out.println("char c datatype :" + ((Object)
        // c).getClass().getSimpleName());
        // System.out.println("long l datatype :" + ((Object)
        // l).getClass().getSimpleName());
        // System.out.println("float f datatype :" + ((Object)
        // f).getClass().getSimpleName());
        // System.out.println("double d datatype :" + ((Object)
        // d).getClass().getSimpleName());
        // System.out.println("string string datatype :" + ((Object)
        // string).getClass().getSimpleName());
        // System.out.println("byte c datatype :" + ((Object)
        // b).getClass().getSimpleName());
        // System.out.println(i);
        // System.out.println(i = 8);
        // System.out.println(i);
    }
}
