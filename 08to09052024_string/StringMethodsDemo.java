public class StringMethodsDemo {
    public static void main(String ard[]) {
        String s = "Java is Platform Independent Programming";
        System.out.println("Total Character in " + s + "\t" + s.length());
        System.out.println("Upper Case \t" + s.toUpperCase());
        System.out.println(s);
        System.out.println("LowerCase \t" + s.toLowerCase());
        System.out.println("substring(7)\t" + s.substring(7));
        System.out.println("substring(7,10)\t" + s.substring(7, 10));
        String s1 = "java";
        String s2 = new String("java");
        String s3 = "java";
        System.out.println("s1==s2\t" + (s1 == s2));
        System.out.println("s1.equals(s2)\t" + (s1.equals(s2)));
        System.out.println("s1==s3\t" + (s1 == s3));
        System.out.println("s1.equals(s3)\t" + (s1.equals(s3)));
        String s4 = "            java            ";
        String s5 = "            Program          ";
        System.out.println("s4+s5\t" + (s4 + s5));
        System.out.println("s4.concat(s5)\t" + (s4.concat(s5)));
        System.out.println("s4+s5 using trim\t" + (s4.trim() + s5.trim()));
        System.out.println("s4.concat(s5)  using trim\t" + (s4.trim().concat(s5.trim())));
    }
}