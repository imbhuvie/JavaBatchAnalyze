public class StringBufferConstructor {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(20);
        StringBuffer sb3 = new StringBuffer("StringBuffer Example");
        System.out.println("sb1 hashcode :" + sb1.hashCode());
        System.out.println("sb1 :" + sb1);
        sb1.append("java");
        System.out.println("sb1 hashcode :" + sb1.hashCode());
        System.out.println("sb1 :" + sb1);
        sb1.append(" Program");
        System.out.println("sb1 hashcode :" + sb1.hashCode());
        System.out.println("sb1 :" + sb1);
        System.out.println("size of sb1 :" + sb1.length());
        System.out.println("size of sb2 :" + sb1.capacity());
        System.out.println("size of sb2 :" + sb2.length());
        System.out.println("size of sb2 :" + sb2.capacity());
        System.out.println("size of sb3 :" + sb3.length());
        System.out.println("size of sb3 :" + sb3.capacity());
        sb1.insert(0, "String handling by ");
        System.out.println("sb1 hashcode :" + sb1.hashCode());
        System.out.println("sb1 :" + sb1);
        System.out.println("size of sb1 :" + sb1.length());
        System.out.println("size of sb2 :" + sb1.capacity());
        sb3.reverse();
        System.out.println("sb3 :" + sb3);
        System.out.println("Reverse of sb3 :" + sb3.reverse());

    }
}
