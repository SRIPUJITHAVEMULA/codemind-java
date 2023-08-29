import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[][]=new int[n][n];
        int brr[][]=new int[n][n];
        int crr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                brr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                crr[i][j]=arr[i][j]+brr[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}