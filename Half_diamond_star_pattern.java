import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,l;
        n=sc.nextInt();
        if(n<3)
        {
            System.out.print("The pattern is not possible");
        }
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(k=n-1;k>=1;k--)
            {
                for(i=1;i<=k;i++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}