import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        double c,sum=0;
        for(int i=a;i<=b;i++)
        {
            c=Math.sqrt(i);
            sum+=c;
        }
        System.out.printf("%.2f",sum);
    }
}