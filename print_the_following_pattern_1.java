import java.util.Scanner;
public class Puji{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k;
		n=sc.nextInt();
		for(i=n;i>=1;--i)
		{
			for(j=1;j<=i;++j)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
	}
}