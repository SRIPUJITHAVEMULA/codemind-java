import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,sum=0;
        int m=n*n;
        while(m!=0)
        {
            r=m%10;
            sum=sum+r;
            m=m/10;
        }
        if(n==sum)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}