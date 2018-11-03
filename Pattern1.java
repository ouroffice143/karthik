import java.util.*;
class Pattern1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);

		System.out.print("\nEnter Limit Of Value:-->");
		int limit=s.nextInt();

		for(int i=0;i<limit;i++)
		{
			for(int j=i;j<limit;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
	}
}