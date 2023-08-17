import java.util.Scanner;
public class Uppercase{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>='A' && c<='Z')
        {
            System.out.printf("uppercase alphabet");
        }
        else if(c>='a' && c<='z')
        {
            System.out.printf("lowercase alphabet");
        }
        else
        {
            System.out.print("not an alphabet");
        }
    }
}