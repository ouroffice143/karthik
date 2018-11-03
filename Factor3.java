import java.util.*;
class Factor3
{
	void m_fact_3()
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.print("\nEnter The Size of array:--->");
			int size=s.nextInt();

			int[] value=new int[size];

			System.out.print("\nEnter Array Values\n");
			for(int i=0;i<size;i++)
			{
				System.out.print("\nEnter Value---->"+(i+1)+"---->");
				value[i]=s.nextInt();
			}

			System.out.println("\nDisplay Stored Values:\n");
			for(int i=0;i<size;i++)
			{
				System.out.print("\nValue:-->"+(i+1)+"--->"+value[i]+"\n");
			}
			
			System.out.print("\nEnter Which Multiple Factor U Want:-->");
			int fact=s.nextInt();
			int j=1;
			for(int i=0;i<size;i++)
			{
				if(value[i]%fact==0)
				{
					System.out.println("\nvalue:--->"+j+"--->"+value[i]+"\n");
					j++;
				}
			}
			if(j==1)
			{
				System.out.print("\n Sorry No Such Type Facor is there\n");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.print("\nPlz Enter Integer Values Only\n");
			m_fact_3();
		}
		catch(NegativeArraySizeException e)
		{
			System.out.print("\nDont Enter Size Value As Negative\n");
			m_fact_3();
		}
	}
	public static void main(String[] args)
	{
		Factor3 obj=new Factor3();
		obj.m_fact_3();
	}
}