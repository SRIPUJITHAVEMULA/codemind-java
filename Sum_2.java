import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,x,y,sum=0;
        a=sc.nextInt();
        b=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%x==0 && i%y!=0)
            {
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}