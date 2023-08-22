import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,x,y,r,e;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            r=x/y;
            e=x%y;
            System.out.printf("%d%n",r+e);
        }
    }
}