import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,sum=0;
        m=sc.nextInt();
        n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum=sum+arr[i][j];
            }
            System.out.print(sum+" ");
            sum=0;
        }    
    }
}