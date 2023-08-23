import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x;
        String a;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            a=sc.next();
            x=Integer.parseInt(a,8);
            System.out.println(Integer.toString(x,2));
            
        }
    }
}