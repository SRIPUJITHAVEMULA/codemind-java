import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        double avg=(num1+num2)/2.0;
        System.out.printf("Average of %d and %d is: %.2f",num1,num2,avg);
    }
}