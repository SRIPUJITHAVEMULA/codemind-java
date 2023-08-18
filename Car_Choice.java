import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double x1,x2,y1,y2;
        int n,i;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            x1=sc.nextDouble();
            x2=sc.nextDouble();
            y1=sc.nextDouble();
            y2=sc.nextDouble();
            double a=(float)y1/x1;
            double b=(float)y2/x2;
            if(a<b)
            {
                System.out.println(-1);
            }
            else if(a==b)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
        }
    }
}