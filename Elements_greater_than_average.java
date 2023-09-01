import java.util.Scanner;
public class Program{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        double avg=sum/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=avg)
            {
             c=c+1;  
            }
        }
        System.out.print(c);
    }
}