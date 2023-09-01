import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        double avg;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        avg=(float)sum/n;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=avg)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}