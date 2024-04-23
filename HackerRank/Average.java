public class Average {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        double n=a.length;
        String s=average(a,n);
        System.out.println(s);
    }
    public static String average(int A[],double N){
        double sum=0;
        for(double num :A){
            sum+=num;
        }
        double avg=sum/N;
        String averageString = String.format("%.2f", avg);
        return averageString;  
    }
}
