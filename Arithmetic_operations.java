import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int dif=a-b;
        int pro=a*b;
        int quo=a/b;
        int rem=a%b;
        System.out.printf("Sum:%d
",sum);
        System.out.printf("Difference:%d
",dif);
        System.out.printf("Product:%d
",pro);
        System.out.printf("Quotient:%d
",quo);
        System.out.printf("Remainder:%d
",rem);
    }
}