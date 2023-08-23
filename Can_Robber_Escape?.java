import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,n,c;
        c=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            a=sc.nextInt();
            if(n>a)
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }    
    }
}