import java.io.*;
import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        // InputStreamReader r=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(r);
        Scanner sc=new Scanner(System.in);
        int line=1;
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            System.out.println(line+" "+s);
            line++;
        }
        }
}