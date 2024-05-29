class Main{
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(String a,String b){
       return (a+b).length(); 
    }
    public static void main(String[] args) {
        int d=sum(2,3);
        System.out.println(d);
        d=sum("verma","bhupendra");
System.out.println(d);
    }

}