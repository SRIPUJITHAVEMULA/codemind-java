import java.util.Scanner;
public class avg{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double c;
        c=(a+b)/2.0;
        System.out.printf("%.4f",c);
    }
}