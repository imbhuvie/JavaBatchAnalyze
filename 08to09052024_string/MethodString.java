
public class MethodString {
    public static void main(String[] args) {
        String p = "hello java";
        System.out.println(p.hashCode());
        String s = "hello";
        String b = s;
        System.out.println(s.hashCode());
        System.out.println(b.hashCode());
        s = s + " java";
        System.out.println(s.hashCode());
        System.out.println(b.hashCode());
        String k = "hello";
        System.out.println(k.hashCode());
        String s1 = "Bhupendra Verma";
        System.out.println(s1);
        System.out.println("s1.length() :" + s1.length());
        System.out.println("s1.toLowerCase() :" + s1.toLowerCase());
        System.out.println("s1.toUpperCase() :" + s1.toUpperCase());
        System.out.println("s1.substring(10) :" + s1.substring(10));
        System.out.println("s1.substring(0, 9) [print(0-8)char] :" + s1.substring(0, 8));
        System.out.println("s1.substring(3, 12) [print(3-11)char] :" + s1.substring(0, 8));

        System.out.println("s1.charAt(2) :" + s1.charAt(2));
        System.out.println("s1.indexOf('p') :" + s1.indexOf('p'));
        s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "JAVA";
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1 == s4); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s4)); // true
        s1 = " m";
        s2 = " MOHIT MISHRA ";
        if (s1.compareTo(s2) == 0)
            System.out.println(" s1.compareTo(s2) == 0 : both are equal");
        if (s1.compareTo(s2) > 0)
            System.out.println("s1.compareTo(s2) > 0 : " + s1 + " is Greater");
        if (s1.compareTo(s2) < 0)
            System.out.println("s1.compareTo(s2) < 0 : " + s2 + " is Greater");

        System.out.println("s1.concat(s2)\t" + (s1.concat(s2)));
        System.out.println("s1+s2 using trim\t" + (s1.trim() + s2.trim()));
        System.out.println("s1.concat(s2)  using trim\t" + (s1.trim().concat(s2.trim())));
    }

}
