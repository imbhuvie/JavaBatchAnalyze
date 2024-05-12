// Wrapper Class:
//     Integer,Float,Character,Short,Double,Long,Byte.

public class WrapperClass {
    public static void main(String[] args) {
        Integer i = 67;
        Float f = 98.56f;
        Character ch = 'a';
        System.out.println("I :" + i + "\tch :" + ch + "\tf :" + f);
        int p = 5;
        Integer n = p; // autoboxing (primitive to object(wrapper class))
        System.out.println("P :" + p + "\tN :" + n);
        p = n; // auto-unboxing
        System.out.println("P :" + p + "\tN :" + n);
        String k = "78";
        int j = Integer.parseInt(k);
        System.out.println("k :" + k + "\t  j :" + j);
    }
}