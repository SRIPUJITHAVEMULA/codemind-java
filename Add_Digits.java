import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%9==0)
        {
            System.out.print(n);
        }
        else
        {
            System.out.print((n%9));
        }
    }
}