import java.util.Scanner;
public class convert{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String OctalString="a";
        OctalString=sc.nextLine();
        int decimal=Integer.parseInt(OctalString,8);
        System.out.println(decimal);
    }
}