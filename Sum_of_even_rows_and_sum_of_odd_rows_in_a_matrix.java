import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,se=0,so=0;
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
                if(i%2==0)
                {
                   se=se+arr[i][j]; 
                }
                else
                {
                    so=so+arr[i][j];
                }
            }
        }
        System.out.print(se+" ");
        System.out.print(so);
    }
}