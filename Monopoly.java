import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,i,n;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if((a+b)<c||(b+c)<a||(c+a)<b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}