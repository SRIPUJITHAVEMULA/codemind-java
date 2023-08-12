import java.util.Scanner;
public class disk{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b,d;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        d=t*s*b*512*2;
        System.out.println(d);
    }
}