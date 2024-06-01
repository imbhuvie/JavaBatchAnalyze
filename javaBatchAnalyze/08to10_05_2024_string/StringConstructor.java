// /Program to Demonstraion of String class Constructor
public class StringConstructor {
    public static void main(String args[]) {
        String s1 = "Java";
        System.out.println("Ref of s1=" + s1.hashCode());
        System.out.println("S1=" + s1);
        s1 = s1 + " Program";

        System.out.println("Ref of s1=" + s1.hashCode());
        System.out.println("S1=" + s1);
        System.out.println("Ref of s1=" + s1.hashCode());
        s1 = "SRMCM Lucknow";
        System.out.println("Ref of s1=" + s1.hashCode());
        System.out.println("S1=" + s1);
        char ch[] = { 'L', 'U', 'C', 'K', 'N', 'O', 'W', 'B', 'N', 'C', 'E', 'T' };
        int value[] = { 10, 20, 48, 49, 50, 80, 525, 21, 243, 4, 32, 2, 2, 2343, 32, 23, 32, 23, 4 };
        byte value2[] = { 65, 90, 48, 97, 100 };
        String s2 = new String();// def Constructor
        String s3 = new String("String Demo");
        String s4 = new String(ch);
        String s5 = new String(ch, 3, 4);
        String s6 = new String(value, 2, 5);
        String s7 = new String(value2, 0);
        String s8 = new String(value2);
        String s9 = new String(new StringBuffer("String Buffer"));
        String s10 = new String(new StringBuilder("StringBuilder"));
        System.out.println("s2=" + s2);
        System.out.println("s3=" + s3);
        System.out.println("s4=" + s4);
        System.out.println("s5=" + s5);
        System.out.println("s6=" + s6);
        System.out.println("s7=" + s7);
        System.out.println("s8=" + s8);
        System.out.println("s9=" + s9);
        System.out.println("s10=" + s10);
        System.out.println("----------------------------------");
    }
}
