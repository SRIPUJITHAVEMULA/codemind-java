import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int inch=sc.nextInt();
        double cm=2.54*inch;
        System.out.printf("%.2f",cm);
        
    }     
}