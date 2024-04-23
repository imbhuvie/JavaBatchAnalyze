public class Patterns {
    public static void pattern1() {
        int n = 5;
        System.out.println("Pattern 1 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("________________________\n");
    }

    public static void pattern2() {
        System.out.println("Pattern 1 :");
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("________________________\n");
    }

    public static void pattern3() {
        System.out.println("Pattern 1 :");
        int n = 4;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("________________________\n");
    }

    public static void pattern4() {
        System.out.println("Pattern 1 :");
        int n = 4;
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("________________________\n");
    }

    public static void pattern5() {
        System.out.println("Pattern 1 :");
        int n = 4;
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("________________________\n");
    }
    public static void pattern6() {
        System.out.println("Pattern 1 :");
        int n = 4;
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < i*2; k++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println("________________________\n");
    }
    public static void main(String[] args) {
        // PATTERNS:::----
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // pattern1();
        // ===================================
        // PATTERNS:::----
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // pattern2();
        // =========================================
        // x x x x x
        // x x x x
        // x x x
        // x x
        // x
        // pattern3();
        // ============================================
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // pattern4();
        // ============================================
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // pattern5();
        // ==================================================
        //    x
        //   xxx
        //  xxxxx
        // xxxxxxx
        // pattern6();
        // =====================================================
        // xxxxxxx
        //  xxxxx
        //   xxx
        //    x
        pattern7();
        pattern8();
    }

    public static void pattern7() {
        System.out.println("Pattern 7 :");
        int n = 8;
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= n-i*2; k++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println("________________________\n");
    }
    public static void pattern8() {
        System.out.println("Pattern 7 :");
        int n = 8;
        for (int i = 65; i < 90; i++) {
            for (int j = 65; j <=i; j++) {
                System.out.print((char)j);
            }
            System.out.println();
        }
        System.out.println("________________________\n");
    }
}
