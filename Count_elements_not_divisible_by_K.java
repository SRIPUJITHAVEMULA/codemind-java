import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k,c=0;
        k=sc.nextInt();
        int intArray[]= new int[n];
        for(int i=0;i<n;i++)
        {
            intArray[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(intArray[i]%k!=0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}