import java.util.*;
class OddEven
{
	void odd_even()
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.print("\nEnter Array Limit:--->");
			int limit=s.nextInt();

			int[] value=new int[limit];
			int[] n_value=new int[limit];

			System.out.print("\nEnter Element In Array\n");
			for(int i=0;i<limit;i++)
			{
				System.out.print("\nEnter Value:-->"+(i+1)+"--->");
				value[i]=s.nextInt();
			}
			System.out.print("\nStored Array Values\n");
			for(int i=0;i<limit;i++)
			{
				System.out.print("\nValue:---"+(i+1)+"--->"+value[i]);
			}
			System.out.print("\nFirst Odd No With Ascending Order");
			System.out.print("\nContinously Even No In Decending order");
			System.out.print("\nIn Sample Array\n");
			Arrays.sort(value);
			
			int count=0;
			int k=0;
			System.out.print("\n");
			for(int i=0;i<limit;i++)
			{
				if(value[i]%2!=0)
				{
					n_value[k]=value[i];
					count++;
					k++;
				}
			}
			int s_limit=limit-count;
			int m=limit-1;
			for(int j=0;j<limit;j++)
			{
				if(value[j]%2==0)
				{
					n_value[m]=value[j];
					m--;
				}
			}
				
			for(int i=0;i<limit;i++)
			{
				System.out.print(n_value[i]+" ,");
			}
			System.out.print("\n");
		}
		catch(InputMismatchException e)
		{
			System.out.print("\nPlz Give Integer Input\n");
			odd_even();
		}
		catch(NegativeArraySizeException e)
		{
			System.out.print("\nDont Give Array Size As Negative\n");
			odd_even();
		}
	}
	public static void main(String[] args)
	{
		OddEven obj=new OddEven();
		obj.odd_even();
	}
}