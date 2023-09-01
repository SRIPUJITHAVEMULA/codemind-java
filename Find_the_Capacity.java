import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        long c,cv;
        c=2*s*t*b*512;
        cv=c/1024;
        System.out.printf("%dKB",cv);
    }
}