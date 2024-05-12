public class FabonacciPattern {
    public static void main(String[] args) {
        int n = 5;
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        int x=(a*2)+1;
        int [][]ar=new int[x][x];
        for(int i=0;i<x;i++){

        }

    }
}
