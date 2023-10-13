import java.util.Scanner;
public class Program{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x==w||y==w||z==w)
        {
            System.out.print("YES");
        }
        else if(x+y==w||y+z==w||x+z==w)
        {
            System.out.println("YES");
        }
        else if(x+y+z==w)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}