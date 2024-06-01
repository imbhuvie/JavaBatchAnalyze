
public class CompareString {
    public static void main(String[] args) {
        String s = "aabC";
        String s0 = "aab";
        System.out.println(s0.compareTo(s));
        String str = "hello how are you";
        String sa[] = str.split("e");
        for (int i = 0; i < sa.length; i++)
            System.out.println(sa[i]);
    }
}
