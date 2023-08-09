import java.util.Scanner;
public class area{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        double d;
        d=(a+b+c)/2;
        double p,n;
        p=(d*(d-a)*(d-b)*(d-c));
        n=Math.sqrt(p);
        System.out.printf("%.2f",n);
    }
}