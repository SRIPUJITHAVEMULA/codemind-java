import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int c=2*t*s*b*512;
        int k=c/1024;
        System.out.printf("%d KB",k);
        
    }     
}