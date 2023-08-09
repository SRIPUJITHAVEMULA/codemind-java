import java.util.Scanner;
public class area{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double d,p,n;
        d=(a+b+c)/2;
        p=(d*(d-a)*(d-b)*(d-c));
        n=Math.sqrt(p);
        System.out.printf("%.2f",n);
    }
}